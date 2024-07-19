package B2_8_2_CONECTA_NUBE;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Actualizar extends JFrame{
    private JPanel panel3;
    private JTextField nombre1;
    private JTextField apellido1;
    private JTextField codigo1;
    private JButton mostrarButton;
    private JButton actualizarButton;
    private JButton volverButton;

    public Actualizar(){
        super("Actualizacion de datos");
        setContentPane(panel3);


        mostrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    mostrar_info();
                }catch (SQLException ex){
                    throw new RuntimeException(ex);
                }
            }
        });
        actualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    actualiacion();
                }catch (SQLException ex){
                    throw new RuntimeException(ex);
                }
            }
        });
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu opcion = new Menu();
                opcion.iniciar();
                dispose();
            }
        });
    }

    public void mostrar_info() throws SQLException {

        String codigo0 = codigo1.getText();

        Connection conecta = conexion();

        String sql = "SELECT * FROM registroj WHERE codigo = ?";
        PreparedStatement pst = conecta.prepareStatement(sql);
        pst.setInt(1,Integer.parseInt(codigo0));

        ResultSet rs = pst.executeQuery();

        if (rs.next()){
            System.out.println("Registro encontrado");
            JOptionPane.showMessageDialog(null,"Registro encontrado","Éxito",JOptionPane.INFORMATION_MESSAGE);

            //mostrando la info en los campos
            nombre1.setText(rs.getString("nombre"));
            apellido1.setText(rs.getString("apellido"));
        }else {
            JOptionPane.showMessageDialog(null,"No existen registros","Error",JOptionPane.ERROR_MESSAGE);
        }
        pst.close();
        rs.close();
        conecta.close();
    }

    public void actualiacion() throws SQLException {

        String codigo0 = codigo1.getText();
        String nombre0 = nombre1.getText();
        String apellido0= apellido1.getText();

        Connection conecta = conexion();

        String sql = "UPDATE registroj SET nombre = ?, apellido = ? WHERE codigo = ?";
        PreparedStatement pst = conecta.prepareStatement(sql);
        pst.setString(1,nombre0);
        pst.setString(2,apellido0);
        pst.setInt(3,Integer.parseInt(codigo0));

        int afectar_filas = pst.executeUpdate();

        if (afectar_filas > 0){
            System.out.println("Registro actualizado");
            JOptionPane.showMessageDialog(null,"Registro Actualizado Correctamente","Éxito",JOptionPane.INFORMATION_MESSAGE);

            //limpiando los campos
            codigo1.setText("");
            nombre1.setText("");
            apellido1.setText("");
        }else {
            JOptionPane.showMessageDialog(null,"Error en la actualizacion","Error",JOptionPane.ERROR_MESSAGE);
        }
        pst.close();
        conecta.close();
    }

    public Connection conexion() throws SQLException {

        String url = "jdbc:mysql://u2qpn7yz95j6wbhy:pLrGc4nM66TVKiQzS34d@b4dtcv5rsu8iwiir6knr-mysql.services.clever-cloud.com:3306/b4dtcv5rsu8iwiir6knr";
        String user = "u2qpn7yz95j6wbhy";
        String password = "pLrGc4nM66TVKiQzS34d";

        return DriverManager.getConnection(url,user,password);
    }


    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

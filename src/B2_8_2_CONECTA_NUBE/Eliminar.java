package B2_8_2_CONECTA_NUBE;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Eliminar extends JFrame{
    private JPanel panel4;
    private JTextField codigo1_borrar;
    private JButton volverButton;
    private JButton eliminarButton;


    public Eliminar() {
        super("Eliminar Registro");
        setContentPane(panel4);

        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    borrar_info();
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

    public void borrar_info() throws SQLException {

        String codigo0_borrar = codigo1_borrar.getText();

        Connection conecta = conexion();

        String sql = "DELETE FROM registroj WHERE codigo = ?";
        PreparedStatement pst = conecta.prepareStatement(sql);
        pst.setInt(1,Integer.parseInt(codigo0_borrar));

        int afectar_filas = pst.executeUpdate();

        if (afectar_filas > 0){
            System.out.println("Registro eliminado");
            JOptionPane.showMessageDialog(null,"Registro Eliminado","Éxito",JOptionPane.INFORMATION_MESSAGE);
            codigo1_borrar.setText("");
        }else {
            System.out.println("No se encontraron registros");
            JOptionPane.showMessageDialog(null,"No se encontraron registros a eliminar","Error",JOptionPane.ERROR_MESSAGE);
        }
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

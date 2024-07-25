package B2_9_SEMANA13_VIERNES;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Clase registro para el ingreso del login
 */

public class Registrar extends JFrame{
    private JPanel panel2;
    private JTextField codigo1;
    private JTextField nombre1;
    private JTextField apellido1;
    private JButton guardarButton;
    private JButton volverButton;

    public Registrar(){
        super("Registrar");
        setContentPane(panel2);


        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    registro();
                }catch (SQLException ex){
                    throw new RuntimeException(ex);
                }
            }
        });
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login entrar = new Login();
                entrar.iniciar();
                dispose();
            }
        });
    }

    public void registro() throws SQLException {

        String codigo0 = codigo1.getText();
        String nombre0 = nombre1.getText();
        String apellido0 = apellido1.getText();

        Connection conecta = conexion();
        String sql = "INSERT INTO acceso(id,usuario,password) VALUES(?,?,?)";

        PreparedStatement pstm = conecta.prepareStatement(sql);
        pstm.setInt(1,Integer.parseInt(codigo0));
        pstm.setString(2,nombre0);
        pstm.setString(3,apellido0);

        int afectar_fila = pstm.executeUpdate();

        if (afectar_fila > 0){
            System.out.println("Datos ingresados con exito");
            JOptionPane.showMessageDialog(null,"Datos ingresados correctamente","Exito",JOptionPane.INFORMATION_MESSAGE);

            codigo1.setText("");
            nombre1.setText("");
            apellido1.setText("");
        }else {
            JOptionPane.showMessageDialog(null,"Fallo con los datos ingresados","Error",JOptionPane.ERROR_MESSAGE);
        }

        pstm.close();
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

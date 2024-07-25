package B2_9_SEMANA13_VIERNES;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

/**
 * Comentario General
 *
 * <p><a href="https://www.youtube.com/watch?v=FwI0gPz-Tz8">Video</a></p>
 * @author Jonathan Ramirez
 * @version 1.0
 * @see Login#iniciar()
 * @since 25/07/2024
 * //@throws IllegalArgumentException
 *
 */

public class Login extends JFrame{

    private JTextField usuario1;
    private JPasswordField contrasenia1;
    private JButton inicio_sesion;
    private JPanel panel1;

    /**
     * Comentario 1 de ingreso al sistema - METODO CONSTRUCTOR
     */
    public Login(){
        super("Inicio de sesión");
        setContentPane(panel1);

        /**
         * Conexion realizada en la nube
         */
        inicio_sesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String url = "jdbc:mysql://u2qpn7yz95j6wbhy:pLrGc4nM66TVKiQzS34d@b4dtcv5rsu8iwiir6knr-mysql.services.clever-cloud.com:3306/b4dtcv5rsu8iwiir6knr";
                String user = "u2qpn7yz95j6wbhy";
                String password = "pLrGc4nM66TVKiQzS34d";

                try (Connection conecta = DriverManager.getConnection(url,user,password)){
                    System.out.println("Conectado a la base de datos");

                    String usuario0 = usuario1.getText();
                    String contrasenia0 = new String(contrasenia1.getPassword());

                    // Consulta de la base de datos
                    String sql = "select * from acceso where usuario=? and password =?";
                    PreparedStatement pst = conecta.prepareStatement(sql);
                    pst.setString(1, usuario0);
                    pst.setString(2, contrasenia0);

                    ResultSet resultado = pst.executeQuery();

                    if (resultado.next()){
                        System.out.println("Inicio exitosoo");
                        JOptionPane.showMessageDialog(null,"Inicio exitoso", "Exito", JOptionPane.INFORMATION_MESSAGE);

                    }
                    else{
                        System.out.println("Usuario o contrasela incorrectos. Intente de nuevo");
                        JOptionPane.showMessageDialog(null,"Usuario o contraseña incorrectos. Intente de nuevo", "Error", JOptionPane.ERROR_MESSAGE);
                        usuario1.setText("");
                        contrasenia1.setText("");
                    }
                }
                catch (SQLException ex){
                    JOptionPane.showMessageDialog(null, "No se conectdo a la base de datos","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    /**
     * Metodo para la vizualizacion de las pantalla login y su tamaño
     */
    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

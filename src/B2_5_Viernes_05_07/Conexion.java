package B2_5_Viernes_05_07;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Conexion extends JFrame{

    private JButton verDatos;
    private JPanel panel1;
    private JLabel mostrar_datos;

    public Conexion(){
        super("Hola");
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(panel1);


        verDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String url = "jdbc:mysql://localhost:3306/esfot_venta"; //nombre de la base de datos: esfotventa
                String user = "root" ;
                String password = "";

                try(Connection connection = DriverManager.getConnection(url, user, password)){
                    System.out.println("Conectado a la base de datos");
                    String query = "select correo from cliente where nombre like 'L%';";
                    Statement statement = connection.createStatement();
                    ResultSet resultSet = statement.executeQuery(query);

                    StringBuilder datos = new StringBuilder("<html>");

                    while(resultSet.next()){
                        datos.append("<b>Nombre:</b> ").append(resultSet.getString("nombre")).append("<br>");
                        datos.append("<b>Correo:</b> ").append(resultSet.getString("correo")).append("<br>");
                        datos.append("<b>Password:</b> ").append(resultSet.getString("password")).append("<br><br>");
                    }

                    datos.append("</html>");
                    mostrar_datos.setText(datos.toString());
                }catch (SQLException ex){
                    mostrar_datos.setText("Error: "+ ex.getMessage());
                }

            }
        });
    }

    public static void main(String[] args) {
        Conexion frame = new Conexion();
        frame.setVisible(true);
        frame.setSize(600, 400); // Configurar el tamaño del panel
    }

    //otra forma de mostrar la pantalla
    /*public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }*/

}

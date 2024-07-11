package B2_6_Jueves_11_07;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Botoncito  extends  JFrame{
    private JButton boton1;
    private JPanel panel1;
    private JTextField nom_respuesta;
    private JTextField edad_respuesta;
    private JLabel nom;
    private JLabel edad;
    private JTextField nota1_respu;
    private JTextField nota2_respu;
    private JLabel not1;
    private JLabel not2;
    private JButton visualizar;
    private JLabel ver_info;


    public Botoncito() {
        super("");
        setTitle("NUEVA CONEXION");
        setContentPane(panel1);
        setSize(300,300);


        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    insertar_datos();
                }catch (SQLException ex){
                    throw new RuntimeException(ex);
                }
            }
        });
        visualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    visualizar_datos();
                }catch (SQLException ex){
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    public void insertar_datos() throws SQLException {
        //esto va en el preparedStatement
        String usuario = nom_respuesta.getText();
        String edad = edad_respuesta.getText();
        String nota1 = nota1_respu.getText();
        String nota2 = nota2_respu.getText();

        Connection conecta = conexion();
        String sql = "INSERT INTO estudiantes(nombre,edad,nota1,nota2) values(?,?,?,?)";

        PreparedStatement pstmt =  conecta.prepareStatement(sql);
        pstmt.setString(1,usuario);  //1 y 2 son los numeros de los parametros
        pstmt.setInt(2,Integer.parseInt(edad));   //conversion de un String del principio a int
        pstmt.setDouble(3,Double.parseDouble(nota1));
        pstmt.setDouble(4,Double.parseDouble(nota2));

        int rowsAffected = pstmt.executeUpdate();
        if (rowsAffected > 0){
            JOptionPane.showMessageDialog(null,"REGISTRO INSERTADO CORRECTAMENTE");
        }
        pstmt.close();
        conecta.close();

    }

    public void visualizar_datos() throws SQLException {
        Connection conecta = conexion();
        String query = "select * from estudiantes ;";
        Statement statement = conecta.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        StringBuilder datos = new StringBuilder("<html>");

        while(resultSet.next()){
            datos.append("<b>Nombre:</b> ").append(resultSet.getString("nombre")).append("<br>");
            datos.append("<b>Edad:</b> ").append(resultSet.getString("edad")).append("<br>");
            datos.append("<b>Nota 1:</b> ").append(resultSet.getString("nota1")).append("<br>");
            datos.append("<b>Nota 2:</b> ").append(resultSet.getString("nota2")).append("<br><br>");
        }

        datos.append("</html>");
        ver_info.setText(datos.toString());
    }

    //Throws:
    public Connection conexion() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/esfot_venta";
        String user = "root";
        String password = "";

        return DriverManager.getConnection(url,user,password);

    }
}

package B2_7_JUEVES_EJER_INGE;

import B2_6_Jueves_11_07.Botoncito;

//public class Main {
//    public static void main(String[] args){
//        String url = "jdbc:mysql://localhost:3306/esfot_venta";
//        String user = "root";
//        String password = "";
//
//        //conexion con la base de datos
//        try (Connection conecta = DriverManager.getConnection(url,user,password)){
//            if (conecta != null){
//                System.out.println("CONEXION EXITOSA A LA BASE DE DATOS");
//            }else {
//                System.out.println("FALLO LA CONEXION A LA BASE DE DATOS");
//            }
//        } catch (SQLException ex){
//            ex.printStackTrace(); //error que se muestra en pantalla
//        }
//    }
//}

public class Main {
    public static void main(String[] args){
        Botoncito ventana = new Botoncito();
        ventana.setVisible(true);
    }
}

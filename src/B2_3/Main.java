package B2_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Main {
    public static void main(String[] args){

        JFrame ventana = new JFrame();
        ventana.setVisible(true);
        ventana.setTitle("JONATHAN RAMIREZ");

        ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));


        /*//LABEL 1
        JLabel label1 = new JLabel("2024-06-21");
        ventana.getContentPane().add(label1);

        JTextField texto1 = new JTextField();
        ventana.getContentPane().add(texto1);

        //PANEL 1
        JPanel panel = new JPanel();
        panel.add(label1);
        panel.add(texto1);

        panel.setBackground(Color.green);
        ventana.add(panel);*/

        //LABEL 2
        //INGRESAR INFORMACION
        JPanel panel1 = new JPanel();

        JLabel usuario = new JLabel("NOMBRE: ");
        ventana.add(usuario);

        JLabel apellido0 = new JLabel("APELLIDO: ");
        ventana.add(apellido0);

        JTextField nombre = new JTextField(20);
        ventana.add(nombre);

        JTextField apellido1 = new JTextField(20);
        ventana.add(apellido1);

        //BUTTON 2
        JButton loginBoton = new JButton("Login");
        loginBoton.setBounds(10,80,80,25);
        ventana.add(loginBoton);

        //AGREGAR UN ACCTIONLISTENER AL BOTOTON

        loginBoton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = nombre.getText();
                String apellido2 = apellido1.getText();
                String nombreCompleto = user + " "+ apellido2;

                JOptionPane.showMessageDialog(panel1, "HOLA " + nombreCompleto + " :3");
            }
        });

        //SE AGREGA COMPONENTES AL PANEL 2

        panel1.add(usuario);
        panel1.add(nombre);
        panel1.add(apellido0);
        panel1.add(apellido1);
        panel1.add(loginBoton);

        panel1.setBackground(Color.lightGray);
        ventana.add(panel1);


    }
}

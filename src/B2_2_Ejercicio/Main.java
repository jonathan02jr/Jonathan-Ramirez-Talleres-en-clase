package B2_2_Ejercicio;

import javax.swing.*;

public class Main {
    public static void main(String[] args){

        // Crear un nuevo JFrame (ventana)
        JFrame frame = new JFrame("Mi ventana GUI ESFOT");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        frame.setVisible(true);

        JLabel label = new JLabel("Hola mundo");
        frame.getContentPane().add(label);

        JLabel label1 = new JLabel("Como estas");
        frame.getContentPane().add(label1);

        JLabel label2 = new JLabel("Que se hace");
        frame.getContentPane().add(label2);

        JLabel label3 = new JLabel("Hello World");
        frame.getContentPane().add(label3);

        //botones
        JButton boton = new JButton("BOTON1");
        frame.getContentPane().add(boton);

        JButton boton1 = new JButton("BOTON2");
        frame.getContentPane().add(boton1);

        JButton boton2 = new JButton("BOTON3");
        frame.getContentPane().add(boton2);

        //FORMA PARA VISUALIZAR LOS LABEL Y LOS BOTONES

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(boton);
        panel.add(boton1);

        frame.getContentPane().add(panel);


    }
}

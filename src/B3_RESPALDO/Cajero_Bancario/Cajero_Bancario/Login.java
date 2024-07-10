package B3_RESPALDO.Cajero_Bancario.Cajero_Bancario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{
    private JTextField contrasenia_Login;
    private JButton ENTERButton;
    private JButton a0Button;
    private JButton a2Button;
    private JButton a3Button;
    private JButton a1Button;
    private JButton a6Button;
    private JButton a5Button;
    private JButton a4Button;
    private JButton a9Button;
    private JButton a8Button;
    private JButton a7Button;
    private JPanel JPanel_Login;

    public Login(){
        super("Inicio de sesión");
        setContentPane(JPanel_Login);


        ENTERButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = "123456";
                String contraIngresada = contrasenia_Login.getText();

                if (contraIngresada.equals(password)){

                }
                else {

                    JOptionPane.showMessageDialog(null,"INTENTA OTRA VEZ","USUARIO INCORRECTO", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contrasenia_Login.setText(contrasenia_Login.getText() + "1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contrasenia_Login.setText(contrasenia_Login.getText() + "2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contrasenia_Login.setText(contrasenia_Login.getText() + "3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contrasenia_Login.setText(contrasenia_Login.getText() + "4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contrasenia_Login.setText(contrasenia_Login.getText() + "5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contrasenia_Login.setText(contrasenia_Login.getText() + "6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contrasenia_Login.setText(contrasenia_Login.getText() + "7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contrasenia_Login.setText(contrasenia_Login.getText() + "8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contrasenia_Login.setText(contrasenia_Login.getText() + "9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contrasenia_Login.setText(contrasenia_Login.getText() + "0");
            }
        });
    }

    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

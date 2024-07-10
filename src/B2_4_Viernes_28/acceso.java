package B2_4_Viernes_28;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class acceso extends JFrame{
    private JTextField usuario_1;
    private JTextField password;
    private JButton ACCESOButton;
    private JPanel JPanel_acceso;


    public acceso(){
        super("VENTANA DE ACCESO");
        setContentPane(JPanel_acceso);


        ACCESOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String contra = "123456";
                String contraIngresada =password.getText();
                String usuario = "jonathan";
                String usuarioIngresado = usuario_1.getText();

                if (contra.equals(contraIngresada) && usuario.equals(usuarioIngresado)){
                    menu ventana_menu = new menu();
                    ventana_menu.iniciar();
                    dispose();//te llama el formulario
                }
                else {
                    JOptionPane.showMessageDialog(null,"EL PASSWORD O EL USUARIO ES INCORRECTO");
                    password.setText("");
                    usuario_1.setText("");
                }

            }
        });
    }

    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}

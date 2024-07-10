package B2_4_Viernes_28;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reporte extends JFrame{
    private JPasswordField passwordField2;
    private JPasswordField passwordField3;
    private JPasswordField passwordField4;
    private JPanel JPanel_reporte;
    private JButton volverAlMenuButton;


    public Reporte(){
        super("REPORTES");
        setContentPane(JPanel_reporte);

        volverAlMenuButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu ventana_volver_menu = new menu();
                ventana_volver_menu.iniciar();
                dispose();

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

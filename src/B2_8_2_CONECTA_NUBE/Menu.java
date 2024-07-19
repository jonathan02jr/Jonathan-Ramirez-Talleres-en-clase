package B2_8_2_CONECTA_NUBE;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{
    private JPanel panel1;
    private JRadioButton registrarInfo;
    private JRadioButton actualizarInfo;
    private JRadioButton eliminarInfo;

    public Menu(){
        super("Menu Principal");
        setContentPane(panel1);

        registrarInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Registrar datos = new Registrar();
                datos.iniciar();
                dispose();
            }
        });
        actualizarInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Actualizar datos = new Actualizar();
                datos.iniciar();
                dispose();
            }
        });
        eliminarInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Eliminar borrar = new Eliminar();
                borrar.iniciar();
                dispose();
            }
        });
    }

    public void iniciar(){
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

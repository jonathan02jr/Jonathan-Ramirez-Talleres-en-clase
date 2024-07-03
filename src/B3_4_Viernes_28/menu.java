package B3_4_Viernes_28;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu  extends JFrame{
    private JPanel JPanel_menu;
    private JButton verVentanaButton;
    private JButton verReportesButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton calcularButton;
    private JLabel val1;
    private JLabel val2;
    private JLabel val_resultado;

    public menu(){
        super("OPCIONES DE MENU");
        setContentPane(JPanel_menu);


        verVentanaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //creamos el objeto
                acceso ventana_ac = new acceso();
                ventana_ac.iniciar();
                dispose();
            }
        });
        verReportesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Reporte ventana_reporte = new Reporte();
                ventana_reporte.iniciar();
                dispose();

            }
        });
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String recibe_val1 = val1.getText();
                float resultado = Float.parseFloat(recibe_val1); //se convierte en tipo float
                float resul = resultado*2;
                //float recibe_val1 = Float.parseFloat(val1.getText()); -- mas rapido
                JOptionPane.showMessageDialog(null,"LOS RESULTADOS SON: "+ resul);

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

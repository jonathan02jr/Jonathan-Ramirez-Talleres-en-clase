import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class BIENVENIDO {
    private JTextField NOMBRETextField;
    private JTextField APELLIDOTextField;
    private JTextField DIRECCIONTextField;
    private JTextField CELULARTextField;
    private JButton CAMPOSButton;
    private JButton INFORMACIONButton;
    private JButton GUARDARButton;

    public BIENVENIDO() {
        GUARDARButton.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });
    }
}

package waterflow;

import javax.swing.*;
import java.awt.event.*;

public class MGDtogpm extends Main {
    private JTextArea MGDToGPMTextArea;
    private JPanel MGDtoGPM;
    private JTextArea convertText;
    private JTextField mgdinput;
    private JTextField gpmoutput;
    private JButton conversionbutton;
    private double mgd;
    private double gpm;

    public MGDtogpm() {

        mgdinput.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }
        });
        conversionbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double mgd = Double.parseDouble(mgdinput.getText());
                double gpm = mgd * 694.44;
                gpmoutput.setText(Double.toString(gpm));
            }
        });
        gpmoutput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.print(gpm);
            }
        });
    }
}


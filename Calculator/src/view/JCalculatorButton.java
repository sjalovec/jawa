package view;
//Trida reprezentujici tlacitko kalkulacky

import action.CalculatorActionIface;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

public class JCalculatorButton extends JButton {
    public JCalculatorButton(String text, int key, final CalculatorActionIface action) {
        super(text);
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                action.performInputAction();
            }
        };
        this.addActionListener(al);
        this.registerKeyboardAction(al, KeyStroke.getKeyStroke(key, 0),JComponent.WHEN_IN_FOCUSED_WINDOW);
    }
    

}

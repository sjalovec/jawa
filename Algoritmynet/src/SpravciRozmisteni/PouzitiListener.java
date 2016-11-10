package SpravciRozmisteni;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class PouzitiListener {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        JFrame frame2 = new JFrame("JFrame okno"); //vytovření okna s popiskem
        JButton but1 = new JButton("Já jsem tlačítko"); //tlačítko s názvem

        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(but1, "Button title: " + but1.getText(), "Tohle je napis okna", JOptionPane.INFORMATION_MESSAGE);
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        frame2.add(but1);

        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.pack();
        frame2.setLocation(100, 100);
        frame2.setVisible(true);

    }
}

package SpravciRozmisteni;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PouzitiFlowLayout {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });

    }

    public static void createAndShowGUI() {
        JFrame frame3 = new JFrame("FlowLayout"); //vytvovření okna s popiskem
        frame3.add(vytvorLayout());
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.pack();
        frame3.setLocation(100, 100);
        frame3.setVisible(true);

    }

    public static JPanel vytvorLayout() {
        JPanel panel = new JPanel();
        FlowLayout flowL1 = new FlowLayout(FlowLayout.CENTER); //zarovnaní na stred
        flowL1.setHgap(50); //horizontalni mezera mezi obsazenymi komponentami v pixelech
        panel.setLayout(flowL1);
        panel.add(new JButton("První"));
        panel.add(new JButton("Druhé"));
        panel.add(new JButton("Třetí"));
        return panel;
    }
}

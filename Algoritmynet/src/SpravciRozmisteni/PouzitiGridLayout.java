package SpravciRozmisteni;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PouzitiGridLayout {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });

    }

    public static void createAndShowGUI() {
        JFrame frame3 = new JFrame("GridLayout"); //vytvovření okna s popiskem
        frame3.add(vytvorLayout());
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.pack();
        frame3.setLocation(100, 100);
        frame3.setVisible(true);

    }

    public static JPanel vytvorLayout() {
        JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayout(0, 2));

        panel4.add(new JButton("první"));
        panel4.add(new JButton("druhé"));
        panel4.add(new JButton("třetí"));
        panel4.add(new JButton("čtvrté"));
        panel4.add(new JButton("páté"));
        return panel4;
    }
}

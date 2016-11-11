package SpravciRozmisteni;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PouzitiBoxLayout {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });

    }

    public static void createAndShowGUI() {
        JFrame frame3 = new JFrame("BoxLayout"); //vytvovření okna s popiskem
        frame3.add(vytvorLayout());
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.pack();
        frame3.setLocation(100, 100);
        frame3.setVisible(true);

    }

    public static JPanel vytvorLayout() {
        JPanel panel3 = new JPanel();
        panel3.setLayout(new BorderLayout());

        Box left = Box.createVerticalBox();
        Box right = Box.createVerticalBox();

        panel3.add(left, BorderLayout.WEST);
        panel3.add(right, BorderLayout.EAST);

        left.setBorder(BorderFactory.createTitledBorder("Left"));
        left.add(new JButton("L1"));
        left.add(Box.createVerticalStrut(10));
        left.add(new JButton("L2"));
        left.add(Box.createVerticalStrut(30));
        left.add(new JButton("L3"));

        right.setBorder(BorderFactory.createTitledBorder("Right"));
        right.add(new JButton("R1"));
        right.add(Box.createVerticalGlue());
        right.add(new JButton("R2"));

        return panel3;
    }
}

package SpravciRozmisteni;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PouzitiBorderLayout {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });

    }

    public static void createAndShowGUI() {
        JFrame frame3 = new JFrame("BorderLayout"); //vytvovření okna s popiskem
        frame3.add(vytvorLayout());
        frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame3.pack();
        frame3.setLocation(100, 100);
        frame3.setVisible(true);

    }

    public static JPanel vytvorLayout() {
        JPanel panel2 = new JPanel();
        BorderLayout BorLay1 = new BorderLayout();
        
        panel2.setLayout(BorLay1);
        
        panel2.add(new JButton("North"), BorderLayout.NORTH);
        panel2.add(new JButton("South"), BorderLayout.SOUTH);
        panel2.add(new JButton("West"), BorderLayout.WEST);
        panel2.add(new JButton("East"), BorderLayout.EAST);
        panel2.add(new JButton("Center"), BorderLayout.CENTER);
        
        return panel2;
    }
}
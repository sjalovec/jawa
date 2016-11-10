package GrafickeRozhrani;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class HelloWorldGUI {

    public static void main(String[] args) {
        //Asynchronne pridej do fronty udalosti zadost o vykresleni GUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createHelloWorld();
            }
        });
    }

    public static void createHelloWorld() {
        JFrame frame = new JFrame("Hello world v okně"); //okno a jeho název
        frame.add(new JLabel("Ahoj světe!"));
        frame.pack(); //upraví okno aby sedělo
        frame.setLocation(100, 100); //levy horni roh bude na souradnici [100, 100]        
        //Pri zmacknuti krizku zavri celou aplikaci (tj. vsechna vlakna)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true); //zobrazuje okno
    }
}

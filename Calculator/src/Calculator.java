
import view.JCalculatorFrame;

//Java pro zacatecniky 25 - kalkulacka
public class Calculator {
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JCalculatorFrame(); //referenci drzi interne JVM
            }
            
        });
    }

}

package view;

import action.impl.DecimalPointAction;
import action.impl.DivisionAction;
import action.impl.MinusAction;
import action.impl.MultiplicationAction;
import action.impl.NumberAction;
import action.impl.PlusAction;
import action.impl.ResetAction;
import action.impl.ResultAction;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import model.CalculatorModel;

public class JCalculatorFrame extends JFrame {

    private CalculatorModel model;

    public JCalculatorFrame() {
        this.model = new CalculatorModel();
        createAndShowGUI();
    }

    private void createAndShowGUI() {
        this.setTitle("Karkulačka");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            //ikonka (freeware) byla ziskana zde: http://www.iconarchive.com/show/mobile-icons-by-webiconset/calculator-icon.html
            this.setIconImage(ImageIO.read(this.getClass().getResource("calculator-icon.png")));
        } catch (IOException ex) {
            ////nepovedlo se, nebudeme z toho delat vedu :-)
            ex.printStackTrace();
        }
        createMenu();
        createCalculator();
        adjustAndDisplayWindow();
    }

    //Zarovna okno a zobrazi jej uzivateli
    private void adjustAndDisplayWindow() {
        this.setResizable(false);
        this.pack();
        Toolkit t = Toolkit.getDefaultToolkit();
        this.setLocation(t.getScreenSize().width / 2 - this.getWidth() / 2, t.getScreenSize().height / 2 - this.getHeight() / 2);
        this.setVisible(true);
    }

    //Vytvori menu aplikace
    private void createMenu() {
        JMenuBar menuBar = new JMenuBar(); //prouzek menu
        JMenu fileMenu = new JMenu("File"); //jednotlivá nabídka
        JMenuItem exit = new JMenuItem("Exit"); //polozka nabidky
        
        //hotkey alt+q uzavře aplikaci
        exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.ALT_MASK));
        
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JCalculatorFrame.this.dispose(); ////zrus okno, rozpustenim vsech oken muze dojit k ukonceni aplikace
            }
        });
        fileMenu.add(exit); //položku vložíme do nabídky
        menuBar.add(fileMenu); //nabidku do prouzku  
        this.add(menuBar, BorderLayout.NORTH); //prouzek na sever hlavniho okna (ramce)
    }

    private void createCalculator() {
        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        panel.setLayout(layout);

        JTextField resultField = new JTextField(String.valueOf(model.getStoredResult())); //pole pro vysledek
        resultField.setHorizontalAlignment(JTextField.TRAILING); //vysledek bude zarovnan na pravou stranu
        resultField.setEditable(false); //nenechame do nej uzivatele sahat
        resultField.setBackground(Color.WHITE); //editable false zabarvi pozadi do sede barvy
        panel.add(resultField, new GridBagConstraints(0, 0, 5, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(5, 5, 10, 5), 0, 0));
        model.setDefaultOperator(new PlusAction(resultField, model) {
            @Override
            public void performInputAction() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });

        final int inset = ButtonGridBagConstraints.DEFAULT_INSETS;
        final int bigInset = inset * 3;

        panel.add(new JCalculatorButton("7", KeyEvent.VK_NUMPAD7, new NumberAction(resultField, model, "7")), new ButtonGridBagConstraints(0, 1));
        panel.add(new JCalculatorButton("8", KeyEvent.VK_NUMPAD8, new NumberAction(resultField, model, "8")), new ButtonGridBagConstraints(1, 1));
        panel.add(new JCalculatorButton("9", KeyEvent.VK_NUMPAD9, new NumberAction(resultField, model, "9")), new ButtonGridBagConstraints(2, 1));
        panel.add(new JCalculatorButton("4", KeyEvent.VK_NUMPAD4, new NumberAction(resultField, model, "4")), new ButtonGridBagConstraints(0, 2));
        panel.add(new JCalculatorButton("5", KeyEvent.VK_NUMPAD5, new NumberAction(resultField, model, "5")), new ButtonGridBagConstraints(1, 2));
        panel.add(new JCalculatorButton("6", KeyEvent.VK_NUMPAD6, new NumberAction(resultField, model, "6")), new ButtonGridBagConstraints(2, 2));
        panel.add(new JCalculatorButton("1", KeyEvent.VK_NUMPAD1, new NumberAction(resultField, model, "1")), new ButtonGridBagConstraints(0, 3));
        panel.add(new JCalculatorButton("2", KeyEvent.VK_NUMPAD2, new NumberAction(resultField, model, "2")), new ButtonGridBagConstraints(1, 3));
        panel.add(new JCalculatorButton("3", KeyEvent.VK_NUMPAD3, new NumberAction(resultField, model, "3")), new ButtonGridBagConstraints(2, 3));
        panel.add(new JCalculatorButton("0", KeyEvent.VK_NUMPAD0, new NumberAction(resultField, model, "0")), new ButtonGridBagConstraints(0, 4, 2, 1));
        panel.add(new JCalculatorButton(".", KeyEvent.VK_DECIMAL, new DecimalPointAction(resultField, model)), new ButtonGridBagConstraints(2, 4));


        panel.add(new JCalculatorButton("+", KeyEvent.VK_ADD, new PlusAction(resultField, model)), new ButtonGridBagConstraints(3, 1, new Insets(inset, bigInset, inset, inset)));
        panel.add(new JCalculatorButton("-", KeyEvent.VK_SUBTRACT, new MinusAction(resultField, model)), new ButtonGridBagConstraints(4, 1));
        panel.add(new JCalculatorButton("\\u00D7", KeyEvent.VK_MULTIPLY, new MultiplicationAction(resultField, model)), new ButtonGridBagConstraints(3, 2, new Insets(inset, bigInset, inset, inset))); //\\u00D7 je UTF8 kod pro znamenko multiplikace
        panel.add(new JCalculatorButton("/", KeyEvent.VK_DIVIDE, new DivisionAction(resultField, model)), new ButtonGridBagConstraints(4, 2));

        panel.add(new JCalculatorButton("AC", KeyEvent.VK_DELETE, new ResetAction(resultField, model)), new ButtonGridBagConstraints(3, 3, 1, 2, new Insets(inset, bigInset, inset, inset)));
        panel.add(new JCalculatorButton("=", KeyEvent.VK_ENTER, new ResultAction(resultField, model)), new ButtonGridBagConstraints(4, 3, 1, 2));
        this.add(panel, BorderLayout.CENTER);

    }

}

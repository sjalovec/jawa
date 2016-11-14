package view;
//Trida pro zjednoduseni konstrukce GridBagConstraints

import java.awt.GridBagConstraints;
import java.awt.Insets;

public class ButtonGridBagConstraints extends GridBagConstraints{
    //Vychozi sirka vnitrnich okraju
    public static final int DEFAULT_INSETS = 5;
    //Zkonstruuje GridBagConstraints pro umisteni komponenty na danych souradnicich s vychozimi okraji
    public ButtonGridBagConstraints(int x, int y) {
        this(x, y, 1, 1);
    }
    //Zkonstruuje GridBagConstraints pro umisteni komponenty na danych souradnicich, sirkou a vyskou pres jednu bunku. 
    //Anchor na stredu, roztazeni do obou stran, vaha 1
    public ButtonGridBagConstraints(int x, int y, Insets insets) {
        this(x, y, 1, 1, insets);
    }
    //Zkonstruuje GridBagConstraints pro umisteni komponenty na danych souradnicich s vychozimi okraji (na vsechny strany <span class="bold">DEFAULT_INSETS</span>).
    //Anchor na stredu, roztazeni do obou stran, vaha 1.
    public ButtonGridBagConstraints(int x, int y, int gridWidth, int gridHeight) {
        this(x, y, gridWidth, gridHeight, new Insets(DEFAULT_INSETS, DEFAULT_INSETS,DEFAULT_INSETS, DEFAULT_INSETS));
    }
    //Zkonstruuje GridBagConstraints pro umisteni komponenty na danych souradnicich.
    //Anchor na stredu, roztazeni do obou stran, vaha 1.
    public ButtonGridBagConstraints(int x, int y, int gridWidth, int gridHeight, Insets insets) {
        super(x, y, gridWidth, gridHeight, 1d, 1d, GridBagConstraints.CENTER,GridBagConstraints.BOTH, insets, 0, 0);
    }
}

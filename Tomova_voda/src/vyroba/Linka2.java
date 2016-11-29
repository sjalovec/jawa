package vyroba;

import storage.RunOutOfGoodies;
import vyrobky.Dvoukolo;
import vyrobky.Liberta;
import vyrobky.Trikolka;
import vyrobky.TypVyrobku;
import vyrobky.VyrobkyIface;
import static zbozicko.TypZbozi.KOLO;
import static zbozicko.TypZbozi.RAM;
import static zbozicko.TypZbozi.SEDLO;

public class Linka2 {
    public static VyrobkyIface vyrobVyrobek2(TypVyrobku model) {
        VyrobkyIface vyrobenyVyrobekzLinky = null;
        switch(model) {
            case LIBERTA:
                vyrobenyVyrobekzLinky = new Liberta();
                break;
            case DVOUKOLO:
                vyrobenyVyrobekzLinky = new Dvoukolo();
                break;
            case TRIKOLKA:
                vyrobenyVyrobekzLinky = new Trikolka();
            default:
                System.out.println("vyber LIBERTA, DVOUKOLO nebo TRIKOLKA");
                break;
        }
            
        return vyrobenyVyrobekzLinky;
    }
    
}

package vyroba;

import vyrobky.Dvoukolo;
import vyrobky.Liberta;
import vyrobky.Trikolka;
import vyrobky.TypVyrobku;
import vyrobky.VyrobkyIface;
import zbozicko.Kolo;
import zbozicko.Ram;
import zbozicko.Sedlo;

public class Linka2 {
    public static VyrobkyIface vyrobVyrobek2(TypVyrobku model) {
        VyrobkyIface vyrobenyVyrobekzLinky = null;
        switch(model) {
            case LIBERTA:
                vyrobenyVyrobekzLinky = new Liberta(new Kolo(), new Kolo(), new Sedlo(), new Ram());
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

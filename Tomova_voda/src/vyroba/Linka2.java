
package vyroba;

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
        VyrobkyIface VIF = null;
        switch(model) {
            case LIBERTA:
                VIF = new Liberta();
                break;
            case DVOUKOLO:
                VIF = new Dvoukolo();
                break;
            case TRIKOLKA:
                VIF = new Trikolka();
            default:
                //tady bude chybovka
                break;
        }
            
        return VIF;
    }
    
}

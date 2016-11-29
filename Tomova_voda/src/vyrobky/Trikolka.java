package vyrobky;

import zbozicko.Kolo;
import zbozicko.Ram;
import zbozicko.Sedlo;

public class Trikolka extends VyrobkyIface {

    private static final String typ_vyrobku = "Trikolka";

    public Trikolka(Kolo kolo_predni, Kolo kolo_leve, Kolo kolo_prave, Ram ram, Sedlo sedlo) {
        super(TypVyrobku.TRIKOLKA);
        vypisTypVyrobku();

    };
    
    @Override
    public void vypisText() {
        System.out.println("Tzn. dětská hračka.");
    };
    
    @Override
    public void vypisTypVyrobku() {
        System.out.println("Vyrábím výrobek: " + typ_vyrobku);
    };
}

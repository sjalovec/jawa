package vyrobky;

import zbozicko.Kolo;
import zbozicko.Ram;
import zbozicko.Sedlo;

public class Dvoukolo extends VyrobkyIface {

    private static final String typ_vyrobku = "Dvoukolo";

    public Dvoukolo(Kolo kolo_predni, Kolo kolo_zadni, Ram ram, Sedlo sedlo_predni, Sedlo sedlo_zadni) {
        super(TypVyrobku.DVOUKOLO);
        vypisTypVyrobku();

    }
    @Override
    public void vypisText() {
        System.out.println("Tzn. kolo pro dva. Dvě kola maj standardně všechny kola, ty tupče!");
    }

    @Override
    public void vypisTypVyrobku() {
        System.out.println("Vyrábím výrobek: " + typ_vyrobku);
    }
}

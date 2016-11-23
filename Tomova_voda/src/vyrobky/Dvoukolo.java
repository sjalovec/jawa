package vyrobky;

import zbozicko.Kolo;
import zbozicko.Ram;
import zbozicko.Sedlo;

public class Dvoukolo implements VyrobkyIface {

    private static final String typ_vyrobku = "Dvoukolo";
    private Kolo predni_kolo;
    private Kolo zadni_kolo;
    private Ram ram;
    private Sedlo predni_sedlo;
    private Sedlo zadni_sedlo;

    public Dvoukolo(Kolo kolo_predni, Kolo kolo_zadni, Ram ram, Sedlo sedlo_predni, Sedlo sedlo_zadni) {
        this.predni_kolo = kolo_predni;
        this.zadni_kolo = kolo_zadni;
        this.ram = ram;
        this.predni_sedlo = sedlo_predni;
        this.zadni_sedlo = sedlo_zadni;
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

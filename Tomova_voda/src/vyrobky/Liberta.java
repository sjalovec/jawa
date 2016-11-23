//je potřeba upravit, až bude vyřešeno dvoukolo + kolo + iface + program
package vyrobky;

import zbozicko.Kolo;
import zbozicko.Ram;
import zbozicko.Sedlo;

public class Liberta implements VyrobkyIface{

    private static final String typ_vyrobku = "Liberta";
    private Kolo predni_kolo;
    private Kolo zadni_kolo;
    private Ram ram;
    private Sedlo sedlo;

    public Liberta(Kolo kolo_predni, Kolo kolo_zadni, Ram ram, Sedlo sedlo) {
        this.predni_kolo = kolo_predni;
        this.zadni_kolo = kolo_zadni;
        this.ram = ram;
        this.sedlo = sedlo;
    }
    @Override
    public void vypisText() {
        System.out.println("Tzn. běžné kolo pro jednoho.");
    }

    @Override
    public void vypisTypVyrobku() {
        System.out.println("Vyrábím výrobek: " + typ_vyrobku);
    }
}

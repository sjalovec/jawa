package vyrobky;

import zbozicko.Kolo;
import zbozicko.Ram;
import zbozicko.Sedlo;

public class Trikolka implements VyrobkyIface {

    private static final String typ_vyrobku = "Trikolka";
    Kolo predni_kolo;
    Kolo zadni_kolo_leve;
    Kolo zadni_kolo_prave;
    Ram ram;
    Sedlo sedlo;

    public Trikolka(Kolo kolo_predni, Kolo kolo_zadni_leve, Kolo kolo_zadni_prave, Ram ram, Sedlo sedlo) {
        this.predni_kolo = kolo_predni;
        this.zadni_kolo_leve = kolo_zadni_leve;
        this.zadni_kolo_prave = kolo_zadni_prave;
        this.ram = ram;
        this.sedlo = sedlo;
    };
    
    @Override
    public void vypisText() {
        System.out.println("Tzn. dětská hračka.");
    };
    
    @Override
    public void vypisTypVyrobku() {
        System.out.println("Typ výrobku: " + typ_vyrobku);
    };
}

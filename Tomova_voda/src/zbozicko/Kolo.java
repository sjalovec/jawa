package zbozicko;

import storage.Sklad;

public class Kolo implements Zbozi {

    public Kolo() {
        Sklad.pocetKolo = Sklad.pocetKolo - 1;
    }
}

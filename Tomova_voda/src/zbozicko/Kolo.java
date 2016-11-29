package zbozicko;

import storage.Sklad;

public class Kolo extends Zbozi {
    public Kolo() {
        super(TypZbozi.KOLO);
        Sklad.pocetKolo = Sklad.pocetKolo - 1;
    }
}

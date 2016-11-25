package zbozicko;

import storage.Sklad;

public class Kolo extends Zbozi {
    Kolo() {
        super(TypZbozi.KOLO);
        Sklad.pocetKolo = Sklad.pocetKolo - 1;
    }
}

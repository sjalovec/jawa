package zbozicko;

import storage.Sklad;

public class Ram extends Zbozi {
    Ram() {
        super(TypZbozi.RAM);
        Sklad.pocetRam = Sklad.pocetRam - 1;
    }
}

package zbozicko;

import storage.Sklad;

public class Ram extends Zbozi {
    public Ram() {
        super(TypZbozi.RAM);
        Sklad.pocetRam = Sklad.pocetRam - 1;
    }
}

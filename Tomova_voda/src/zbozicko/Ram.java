package zbozicko;

import storage.Sklad;

public class Ram implements Zbozi {

    public Ram() {
        Sklad.pocetRam = Sklad.pocetRam - 1;
    }
}

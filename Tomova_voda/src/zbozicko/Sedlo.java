package zbozicko;

import storage.Sklad;

public class Sedlo implements Zbozi{
    public Sedlo() {
        Sklad.pocetSedlo = Sklad.pocetSedlo - 1;
    }

}

package zbozicko;

import storage.Sklad;

public class Sedlo extends Zbozi{
    Sedlo() {
        super(TypZbozi.SEDLO);
        Sklad.pocetSedlo = Sklad.pocetSedlo - 1;
    }

}

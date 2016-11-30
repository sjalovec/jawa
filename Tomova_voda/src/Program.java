//main je tady, hlavne ted na zkouseni 

//public static Kolo dement; -TGIF 2016

import storage.Sklad;
import storage.RunOutOfGoodies;
//import vyroba.Linka;
import vyroba.Linka2;
import vyrobky.TypVyrobku;

public class Program {

    public static void main(String[] args) throws RunOutOfGoodies {
        Sklad.vypisStavZbozi("kolo");
        Sklad.vypisStavZbozi("ram");
        Sklad.vypisStavZbozi("sedlo");
        //vyroba.Linka.vyrobVyrobek("Liberta");
        Linka2.vyrobVyrobek2(TypVyrobku.TRIKOLKA);
        Sklad.vypisStavZbozi("kolo");
        Sklad.vypisStavZbozi("ram");
        Sklad.vypisStavZbozi("sedlo");
        
        //Linka.pocetVyrobku();

    }

}

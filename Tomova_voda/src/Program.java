//main je tady, hlavne ted na zkouseni 

//public static Kolo dement; -TGIF 2016

import storage.Sklad;
import storage.RunOutOfGoodies;
import vyroba.Linka2;

public class Program {

    public static void main(String[] args) throws RunOutOfGoodies {
        //VstupUziv.vratVyber();
        
        Sklad.vypisStavZbozi("kolo");
        Sklad.vypisStavZbozi("ram");
        Sklad.vypisStavZbozi("sedlo");
        Linka2.vyrobVyrobek2(VstupUziv.vratVyber());
        //Linka2.vyrobVyrobek2(TypVyrobku.LIBERTA);
        Sklad.vypisStavZbozi("kolo");
        Sklad.vypisStavZbozi("ram");
        Sklad.vypisStavZbozi("sedlo");
        
        Linka2.pocetVyrobku();

    }

}

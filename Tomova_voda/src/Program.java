//main je tady, hlavne ted na zkouseni 

//public static Kolo dement; -TGIF 2016

import storage.Sklad;
import vyroba.Linka;

public class Program {

    public static void main(String[] args) {
        vyroba.Linka.vyrobVyrobek("Trikolka");
        Sklad.stavZbozi("kolo");
        Sklad.stavZbozi("ram");
        Sklad.stavZbozi("sedlo");
        
        Linka.pocetVyrobku();

    }

}

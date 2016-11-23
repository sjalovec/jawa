//main je tady, hlavne ted na zkouseni 

//public static Kolo dement; -TGIF 2016

import storage.Sklad;
import storage.runOutOfGoods;
import vyroba.Linka;

public class Program {

    public static void main(String[] args) throws runOutOfGoods {
        Sklad.stavZbozi("kolo");
        Sklad.stavZbozi("ram");
        Sklad.stavZbozi("sedlo");
        vyroba.Linka.vyrobVyrobek("Liberta");
        Sklad.stavZbozi("kolo");
        Sklad.stavZbozi("ram");
        Sklad.stavZbozi("sedlo");
        
        Linka.pocetVyrobku();

    }

}

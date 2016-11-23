//main je tady, hlavne ted na zkouseni 

//public static Kolo dement; -TGIF 2016

import storage.Sklad;
import vyroba.Linka;
import vyrobky.Dvoukolo;
import vyrobky.Liberta;
import vyrobky.Trikolka;
import zbozicko.Kolo;
import zbozicko.Ram;
import zbozicko.Sedlo;

public class Program {

    public static void main(String[] args) {
        vyroba.Linka.vyrobVyrobek("Trikolka");
        Sklad.stavZbozi("kolo");
        Sklad.stavZbozi("ram");
        Sklad.stavZbozi("sedlo");
        
        System.out.println("Je vyrobeno: "+Linka.pocetVyrobku()+" ks výrobků.");

    }

}

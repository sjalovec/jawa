//main je tady, hlavne ted na zkouseni 

//public static Kolo dement; -TGIF 2016
import storage.Sklad;
import storage.RunOutOfGoodies;
import vyroba.Linka2;

public class Program {

    public static void main(String[] args) throws RunOutOfGoodies {
/*
        //tady máme výrobní linku,kterou pro unit testy přeskočíme
        boolean stavVyroby = true;
        while (stavVyroby == true) {
            System.out.println("\n");
            Sklad.vypisStavZbozi("kolo");
            Sklad.vypisStavZbozi("ram");
            Sklad.vypisStavZbozi("sedlo");
            Linka2.vyrobVyrobek2(VstupUziv.vratVyber());
            Sklad.vypisStavZbozi("kolo");
            Sklad.vypisStavZbozi("ram");
            Sklad.vypisStavZbozi("sedlo");

            Linka2.pocetVyrobku();

            //volání na opakování akce
            stavVyroby = VstupUziv.rozhodnutiVyroba();
        }
*/
        //tady máme unit testy
        
        //objednava zboží
        unitTests.VstupUzivUtest.objednejZboziTest();
        //zjišťuje stav konkrétního zbozi
        unitTests.VstupUzivUtest.vypisStavZboziTest();
        //zjisti, zda je dostatek zbozi na vyrobeni kol
        unitTests.VstupUzivUtest.dostatekZboziTest();
        //otestování vyrobení liberty
        unitTests.VstupUzivUtest.vyrobVyrobek2Test();
        
    }

}

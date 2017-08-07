//main je tady, hlavne ted na zkouseni 

//public static Kolo dement; -TGIF 2016
import storage.Sklad;
import storage.RunOutOfGoodies;
import vyroba.Linka2;

public class Program {

    public static void main(String[] args) throws RunOutOfGoodies {

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
    }

}

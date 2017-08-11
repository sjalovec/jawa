package unitTests;

import storage.Sklad;
import vyrobky.VyrobkyIface;

public class VstupUzivUtest {

    public static void objednejZboziTest() {
        //String zbozi = "kolo";
        System.out.println("\nZačínají unit testy");
        //objedná 1 kolo
        Sklad.objednejZbozi("kolo", 1);
        //objedná 0 rámů
        Sklad.objednejZbozi("ram", 0);
        //objednej 10 sedel
        Sklad.objednejZbozi("sedlo", 10);
    }

    public static void vypisStavZboziTest() {
        //vypíše stav zvoží kolo
        Sklad.vypisStavZbozi("kolo");
        //vypíše stav zboží rám
        Sklad.vypisStavZbozi("ram");
        //vypise stav zovzi sedlo
        Sklad.vypisStavZbozi("sedlo");
    }

    public static void dostatekZboziTest() {
        //zjisti, zda je dostatek zbozi pro vyrobení liberty
        if (Sklad.dostatekZbozi("Liberta") == true) {
            System.out.println("Je dostatek zboží na vyrobení Liberty");
        } else {
            System.out.println("Není dostatek zboží na vyrobení Liberta");
        }
        if (Sklad.dostatekZbozi("Trikolka") == true) {
            System.out.println("Je dostatek zboží na vyrobení Trikolka");
        } else {
            System.out.println("Není dostatek zboží na vyrobení Trikolka");
        }
        if (Sklad.dostatekZbozi("Dvoukolo") == true) {
            System.out.println("Je dostatek zboží na vyrobení Dvoukolo");
        } else {
            System.out.println("Není dostatek zboží na vyrobení Dvoukolo");
        }
    }
    
    public static void vyrobky.VyrobkyIface vyrobVyrobek2Test(){
        VyrobkyIface vyrobenyVyrobekzLinkyTest = null;
        //Linka2;
                return vyrobenyVyrobekzLinkyTest;
    }
}

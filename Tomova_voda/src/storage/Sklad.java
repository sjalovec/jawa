package storage;
//potřeba dořešit

public class Sklad {

    public void odeberZbozi() throws Exception {
        runOutOfGoods();
    }

    public static void runOutOfGoods() throws Exception {
        throw new Exception("Zboží není skladem");
    }
    //zatim konfigurace na Liberta
    public static int pocetKolo = 2;
    public static int pocetSedlo = 1;
    public static int pocetRam = 1;
    
    public static void setPocetKolo(int pocetKs) {
        pocetKolo = pocetKolo+pocetKs;
    }
}

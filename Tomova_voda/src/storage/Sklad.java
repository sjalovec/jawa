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
    
    public static void objednejZbozi(String zbozi, int pocetKs) {
        switch (zbozi) {
            case "kolo":
                pocetKolo = pocetKolo+pocetKs;
                System.out.println("Bylo přidáno "+pocetKs+" ks zboží "+zbozi+" na sklad.");
                break;
            case "sedlo":
                pocetSedlo = pocetSedlo+pocetKs;
                System.out.println("Bylo přidáno "+pocetKs+" ks zboží "+zbozi+" na sklad.");
                break;
            case "ram":
                pocetRam = pocetRam+pocetKs;
                System.out.println("Bylo přidáno "+pocetKs+" ks zboží "+zbozi+" na sklad.");
                break;
            default:
                System.out.println("Nebylo zadáno správné zboží.");
                break;
        }
    };
    
    public static void stavZbozi(String zbozi) {
        switch (zbozi) {
            case "kolo":
                System.out.println("Aktuálně je zboží "+zbozi+" na skladě: "+pocetKolo+" ks.");
                break;
            case "sedlo":
                System.out.println("Aktuálně je zboží "+zbozi+" na skladě: "+pocetSedlo+" ks.");
                break;
            case "ram":
                System.out.println("Aktuálně je zboží "+zbozi+" na skladě: "+pocetRam+" ks.");
                break;
            default:
                System.out.println("Nebylo zadáno správné zboží.");
                break;
        }
    };
    /*
    public static void setPocetKolo(int pocetKsKolo) {
        pocetKolo = pocetKolo+pocetKsKolo;
    }
    public static void setPocetSedlo(int pocetKsSedlo) {
        pocetSedlo = pocetSedlo+pocetKsSedlo;
    }
    public static void setPocetRam(int pocetKsRam) {
        pocetRam = pocetRam+pocetKsRam;
    }
    */
}

package storage;
//potřeba dořešit

public class Sklad {

    //zatim konfigurace na Liberta
    public static int pocetKolo = 3;
    public static int pocetSedlo = 1;
    public static int pocetRam = 1;

    public static void objednejZbozi(String zbozi, int pocetKs) {
        switch (zbozi) {
            case "kolo":
                pocetKolo = pocetKolo + pocetKs;
                System.out.println("Bylo přidáno " + pocetKs + " ks zboží " + zbozi + " na sklad.");
                break;
            case "sedlo":
                pocetSedlo = pocetSedlo + pocetKs;
                System.out.println("Bylo přidáno " + pocetKs + " ks zboží " + zbozi + " na sklad.");
                break;
            case "ram":
                pocetRam = pocetRam + pocetKs;
                System.out.println("Bylo přidáno " + pocetKs + " ks zboží " + zbozi + " na sklad.");
                break;
            default:
                System.out.println("Nebylo zadáno správné zboží.");
                break;
        }
    };
    
    public static void stavZbozi(String zbozi) {
        switch (zbozi) {
            case "kolo":
                System.out.println("Aktuálně je zboží " + zbozi + " na skladě: " + pocetKolo + " ks.");
                break;
            case "sedlo":
                System.out.println("Aktuálně je zboží " + zbozi + " na skladě: " + pocetSedlo + " ks.");
                break;
            case "ram":
                System.out.println("Aktuálně je zboží " + zbozi + " na skladě: " + pocetRam + " ks.");
                break;
            default:
                System.out.println("Nebylo zadáno správné zboží.");
                break;
        }
    };
    
    public static boolean dostatekZbozi(String vstupZbozi) {
        switch(vstupZbozi) {
            case "Liberta":
                if (pocetKolo >= 2 && pocetSedlo >= 1 && pocetRam >= 1) {
                    return true;          
                } else {
                    return false;
                }
            case "Dvoukolo":
                if(pocetKolo >= 2 && pocetSedlo >= 2 && pocetRam >= 1){
                    return true;
                } else {
                    return false;
                }
            case "Trikolka":
                if(pocetKolo >= 3 && pocetSedlo >= 1 && pocetRam >= 1) {
                    return true;
                } else {
                    return false;
                }
            default:
                return false;
        }
    };
    
    public static int pocetKsObjednavky(String vstupZboziObj, String vstupVyrobekObj) {
        switch(vstupZboziObj) {
            case "kolo":
                if (pocetKolo >= 2 && pocetSedlo >= 1 && pocetRam >= 1) {
                    return 1;          
                } else {
                    return 1;
                }
           
            default:
                return 1;
        }
    }
}

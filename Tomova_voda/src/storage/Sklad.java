package storage;
//potřeba dořešit

public class Sklad {

    //zatim konfigurace na Liberta
    public static int pocetKolo = 2;
    public static int pocetRam = 0;
    public static int pocetSedlo = 1;
    
    //metoda objednejZbozi neni potreba pro přídávání zboží, nakonec se pouzila metoda stavZboziVypocet
    public static void objednejZbozi(String zbozi, int pocetKs) {
        switch (zbozi) {
            case "kolo":
                //pocetKolo = pocetKolo + pocetKs;
                if (pocetKs != 0) {
                System.out.println("Bylo přidáno " + pocetKs + " ks zboží " + zbozi + " na sklad.");
                }
                break;
            case "sedlo":
                //pocetSedlo = pocetSedlo + pocetKs;
                if (pocetKs != 0) {
                System.out.println("Bylo přidáno " + pocetKs + " ks zboží " + zbozi + " na sklad.");
                }
                break;
            case "ram":
                //pocetRam = pocetRam + pocetKs;
                if (pocetKs != 0) {
                System.out.println("Bylo přidáno " + pocetKs + " ks zboží " + zbozi + " na sklad.");
                }
                break;
            default:
                System.out.println("Nebylo zadáno správné zboží.");
                break;
        }
    };
    
    public static void vypisStavZbozi(String zbozi) {
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
    
    public static void stavZboziVypocet(String vstupVyrobekObjZbozi) {
        switch (vstupVyrobekObjZbozi) {
            case "Liberta":
                int lib_kol = 2 - pocetKolo;
                int lib_sed = 1 - pocetSedlo;
                int lib_ram = 1 - pocetRam;
                pocetKolo = pocetKolo + lib_kol;                
                pocetSedlo = pocetSedlo + (lib_sed);
                pocetRam = pocetRam + (lib_ram);
                objednejZbozi("kolo", lib_kol);
                objednejZbozi("sedlo", lib_sed);
                objednejZbozi("ram", lib_ram);
                break;
            case "Dvoukolo":
                pocetKolo = pocetKolo + (2 - pocetKolo);
                pocetSedlo = pocetSedlo + (2 - pocetSedlo);
                pocetRam = pocetRam + (1 - pocetRam);
                break;
            case "Trikolka":
                pocetKolo = pocetKolo + (3 - pocetKolo);
                pocetSedlo = pocetSedlo + (1 - pocetSedlo);
                pocetRam = pocetRam + (1 - pocetRam);
                break;
        }
    };
    
    public static boolean dostatekZbozi(String vstupZbozi) {
        switch (vstupZbozi) {
            case "Liberta":
                if (pocetKolo >= 2 && pocetSedlo >= 1 && pocetRam >= 1) {
                    return true;
                } else {
                    return false;
                }
            case "Dvoukolo":
                if (pocetKolo >= 2 && pocetSedlo >= 2 && pocetRam >= 1) {
                    return true;
                } else {
                    return false;
                }
            case "Trikolka":
                if (pocetKolo >= 3 && pocetSedlo >= 1 && pocetRam >= 1) {
                    return true;
                } else {
                    return false;
                }
            default:
                return false;
        }
    };
}

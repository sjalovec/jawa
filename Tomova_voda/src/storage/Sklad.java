package storage;
//potřeba dořešit

public class Sklad {

    //zatim konfigurace na Liberta
    public static int pocetKolo = 1;
    public static int pocetRam = 1;
    public static int pocetSedlo = 1;

    //metoda objednejZbozi neni potreba pro přídávání zboží, nakonec se pouzila metoda stavZboziVypocet
    // pro potřeby unit testu upraveno, aby při volání objednávalo zboží a "dávalo" na sklad
    public static void objednejZbozi(String zbozi, int pocetKs) {
        switch (zbozi) {
            case "kolo":
                //
                if (pocetKs != 0) {
                    pocetKolo = pocetKolo + pocetKs;
                    System.out.println("Bylo přidáno " + pocetKs + " ks zboží " + zbozi + " na sklad.");
                }
                break;
            case "sedlo":
                //
                if (pocetKs != 0) {
                    pocetSedlo = pocetSedlo + pocetKs;
                    System.out.println("Bylo přidáno " + pocetKs + " ks zboží " + zbozi + " na sklad.");
                }
                break;
            case "ram":
                //
                if (pocetKs != 0) {
                    pocetRam = pocetRam + pocetKs;
                    System.out.println("Bylo přidáno " + pocetKs + " ks zboží " + zbozi + " na sklad.");
                }
                break;
            default:
                System.out.println("Nebylo zadáno správné zboží.");
                break;
        }
    }

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
    }

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
                int dv_kol = 2 - pocetKolo;
                int dv_sed = 2 - pocetSedlo;
                int dv_ram = 1 - pocetRam;
                pocetKolo = pocetKolo + dv_kol;
                pocetSedlo = pocetSedlo + dv_sed;
                pocetRam = pocetRam + dv_ram;
                objednejZbozi("kolo", dv_kol);
                objednejZbozi("sedlo", dv_sed);
                objednejZbozi("ram", dv_ram);
                break;
            case "Trikolka":
                int tr_kol = 3 - pocetKolo;
                int tr_sed = 1 - pocetSedlo;
                int tr_ram = 1 - pocetRam;
                pocetKolo = pocetKolo + tr_kol;
                pocetSedlo = pocetSedlo + tr_sed;
                pocetRam = pocetRam + tr_ram;
                objednejZbozi("kolo", tr_kol);
                objednejZbozi("sedlo", tr_sed);
                objednejZbozi("ram", tr_ram);
                break;
        }
    }

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
    }
}

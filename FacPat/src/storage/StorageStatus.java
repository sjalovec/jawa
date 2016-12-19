package storage;

public class StorageStatus {

    static int pocetKSKolo = 1;
    static int pocetKSRam = 1;
    static int pocetKSSedlo = 1;

    public static void checkStorageLiberta() {
        if (pocetKSKolo < 2 && pocetKSRam < 1 && pocetKSSedlo < 1) {
            System.out.println("není dostatečný počet kusů");
            //return false;
        } else {
            System.out.println("Kontrola zboží úspěšná");
            //return true;
        }
    }

}

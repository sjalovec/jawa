package storage;

public class OrderGoodsTrikolka {

    public static void orderAllGoods() {
        System.out.println("Objednávám zboží:");
        //objedná kola podle poctu na sklade pro liberta + vypise co objednalo, pokud je počet chybějích kusů vic než 0
        if ((2 - StorageStatus.pocetKSKolo) != 0) {
            int kolo = (3 - StorageStatus.pocetKSKolo);
            StorageStatus.pocetKSKolo = StorageStatus.pocetKSKolo + (kolo);
            System.out.println(kolo + " ks kolo");
        }
        //objedna ramy podle poctu na sklade pro liberta + vypise co objednalo, pokud je počet chybějích kusů vic než 0
        if ((1 - StorageStatus.pocetKSRam) != 0) {
            int ram = (1 - StorageStatus.pocetKSRam);
            StorageStatus.pocetKSRam = StorageStatus.pocetKSRam + (ram);
            System.out.println(ram + " ks ram");
        }
        //objedna sedla podle poctu na sklade pro liberta + vypise co objednalo, pokud je počet chybějích kusů vic než 0
        if ((1 - StorageStatus.pocetKSSedlo) != 0) {
            int sedlo = (1 - StorageStatus.pocetKSSedlo);
            StorageStatus.pocetKSSedlo = StorageStatus.pocetKSSedlo + (sedlo);
            System.out.println(sedlo + " ks sedlo");
        }
    }
}

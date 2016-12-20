package storage;

import goods.Kolo;
import goods.Ram;
import goods.Sedlo;

public class StorageStatus {

    static int pocetKSKolo = 1;
    static int pocetKSRam = 1;
    static int pocetKSSedlo = 1;

    public static boolean checkStorageLiberta() {
        if (pocetKSKolo >= 2 && pocetKSRam >= 1 && pocetKSSedlo >= 1) {
            System.out.println("Kontrola zboží úspěšná.");
            return true;
        } else {
            System.out.println("Není dostatečný počet kusů zboží na skladě.");
            return false;
        }
    }

    public static void useGoodsLiberta() {
        Kolo frontWheel = new Kolo();
        frontWheel.use_goods();
        pocetKSKolo--;
        Kolo rearWheel = new Kolo();
        rearWheel.use_goods();
        pocetKSKolo--;
        Ram frameLiberta = new Ram();
        frameLiberta.use_goods();
        pocetKSRam--;
        Sedlo seat = new Sedlo();
        seat.use_goods();
        pocetKSSedlo--;
    }

    public static boolean checkStorageDvoukolo() {
        if (pocetKSKolo >= 2 && pocetKSRam >= 1 && pocetKSSedlo >= 2) {
            System.out.println("Kontrola zboží úspěšná");
            return true;
        } else {
            System.out.println("Není dostatečný počet kusů");
            return false;
        }
    }

    public static void useGoodsDvoukolo() {
        Kolo frontWheel = new Kolo();
        frontWheel.use_goods();
        pocetKSKolo--;
        Kolo rearWheel = new Kolo();
        rearWheel.use_goods();
        pocetKSKolo--;
        Ram frameLiberta = new Ram();
        frameLiberta.use_goods();
        pocetKSRam--;
        Sedlo frontSeat = new Sedlo();
        frontSeat.use_goods();
        pocetKSSedlo--;
        Sedlo rearSeat = new Sedlo();
        rearSeat.use_goods();
        pocetKSSedlo--;
    }

    public static boolean checkStorageTrikolka() {
        if (pocetKSKolo >= 3 && pocetKSRam >= 1 && pocetKSSedlo >= 1) {
            System.out.println("Kontrola zboží úspěšná");
            return true;
        } else {
            System.out.println("Není dostatečný počet kusů");
            return false;
        }
    }

    public static void useGoodsTrikolka() {
        Kolo frontWheel = new Kolo();
        frontWheel.use_goods();
        pocetKSKolo--;
        Kolo rearWheelRight = new Kolo();
        rearWheelRight.use_goods();
        pocetKSKolo--;
        Kolo rearWheelLeft = new Kolo();
        rearWheelLeft.use_goods();
        pocetKSKolo--;
        Ram frameLiberta = new Ram();
        frameLiberta.use_goods();
        pocetKSRam--;
        Sedlo seat = new Sedlo();
        seat.use_goods();
        pocetKSSedlo--;
    }
}

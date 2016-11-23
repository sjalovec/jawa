package vyroba;

import vyrobky.Dvoukolo;
import vyrobky.Liberta;
import vyrobky.Trikolka;
import zbozicko.Kolo;
import zbozicko.Ram;
import zbozicko.Sedlo;

public class Linka {
    public static int pocetVyrobku = 0;
    
    public static void vyrobVyrobek(String vyrobek) {
        switch (vyrobek) {
            case "Liberta":
                Liberta l = new Liberta(new Kolo(), new Kolo(), new Ram(), new Sedlo());
                l.vypisTypVyrobku();
                l.vypisText();
                pocetVyrobku++;
                break;
            case "Dvoukolo":
                Dvoukolo dk = new Dvoukolo(new Kolo(), new Kolo(), new Ram(), new Sedlo(), new Sedlo());
                dk.vypisTypVyrobku();
                dk.vypisText();
                pocetVyrobku++;
                break;
            case "Trikolka":
                Trikolka tk = new Trikolka(new Kolo(), new Kolo(), new Kolo(), new Ram(), new Sedlo());
                tk.vypisTypVyrobku();
                tk.vypisText();
                pocetVyrobku++;
                break;
            default:
                System.out.println("Nebyl zadán správný výrobek.");
                break;
        }
    }
    public static int pocetVyrobku() {
        return pocetVyrobku;
    }
}

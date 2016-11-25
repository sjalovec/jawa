package vyroba;

import storage.Sklad;
import storage.RunOutOfGoodies;
import vyrobky.Dvoukolo;
import vyrobky.Liberta;
import vyrobky.Trikolka;
import zbozicko.Kolo;
import zbozicko.Ram;
import zbozicko.Sedlo;
import static zbozicko.TypZbozi.KOLO;
import static zbozicko.TypZbozi.RAM;
import static zbozicko.TypZbozi.SEDLO;
import zbozicko.Zbozi;

public class Linka {
    public static int pocetVyrobku = 0;
    
    public static void vyrobVyrobek(String vyrobek) throws RunOutOfGoodies {
        switch (vyrobek) {
            case "Liberta":
                if (Sklad.dostatekZbozi("Liberta") == false) {
                    throw new RunOutOfGoodies();
                } else {
                Liberta l = new Liberta(new Zbozi(KOLO), new Zbozi(KOLO), new Zbozi(RAM), new Zbozi(SEDLO));
                l.vypisTypVyrobku();
                pocetVyrobku++;
                }
                break;
            case "Dvoukolo":
                if (Sklad.dostatekZbozi("Dvoukolo") == false) {
                    throw new RunOutOfGoodies();
                } else {
                Dvoukolo dk = new Dvoukolo(new Kolo(), new Kolo(), new Ram(), new Sedlo(), new Sedlo());
                dk.vypisTypVyrobku();
                pocetVyrobku++;
                }
                break;
            case "Trikolka":
            if (Sklad.dostatekZbozi("Trikolka") == false) {
                    throw new RunOutOfGoodies();
                } else {
                Trikolka tk = new Trikolka(new Kolo(), new Kolo(), new Kolo(), new Ram(), new Sedlo());
                tk.vypisTypVyrobku();
                pocetVyrobku++;
                }
                break;
            default:
                System.out.println("Nebyl zadán správný výrobek.");
                break;
        }
    }
    public static void pocetVyrobku() {
        System.out.println("Je vyrobeno: "+pocetVyrobku+" ks výrobků.");
    }
}

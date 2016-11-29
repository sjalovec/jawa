package vyroba;
//doplnit kontrolu na pocet zbozi na sklade pred voláním konstruktoru (nejlep jako metoda volana vstupní promenou)
import storage.RunOutOfGoodies;
import storage.Sklad;
import vyrobky.Dvoukolo;
import vyrobky.Liberta;
import vyrobky.Trikolka;
import vyrobky.TypVyrobku;
import vyrobky.VyrobkyIface;
import zbozicko.Kolo;
import zbozicko.Ram;
import zbozicko.Sedlo;

public class Linka2 { 
    public static int pocetVyrobku = 0;
    public static VyrobkyIface vyrobVyrobek2(TypVyrobku model) throws RunOutOfGoodies {
        VyrobkyIface vyrobenyVyrobekzLinky = null;
        switch(model) {
            case LIBERTA:
                for (int i = 0; i < 2; i++) {               
                if (Sklad.dostatekZbozi("Liberta") == false) {
                    System.out.println("Není dostatečný počet zboží na skladě");
                    //throw new RunOutOfGoodies();
                    Sklad.objednejZbozi("kolo", 2);
                    Sklad.objednejZbozi("ram", 1);
                    Sklad.objednejZbozi("sedlo", 1);
                } else {
                vyrobenyVyrobekzLinky = new Liberta(new Kolo(), new Kolo(), new Sedlo(), new Ram());
                pocetVyrobku++;
                break;
                }
                }
                break;
            case DVOUKOLO:
                vyrobenyVyrobekzLinky = new Dvoukolo(new Kolo(), new Kolo(), new Ram(), new Sedlo(), new Sedlo());
                break;
            case TRIKOLKA:
                vyrobenyVyrobekzLinky = new Trikolka(new Kolo(), new Kolo(), new Kolo(), new Ram(), new Sedlo());
            default:
                System.out.println("vyber LIBERTA, DVOUKOLO nebo TRIKOLKA");
                break;
        }
            
        return vyrobenyVyrobekzLinky;
    }
    public static void pocetVyrobku() {
        System.out.println("Je vyrobeno: "+pocetVyrobku+" ks výrobků.");
    }
}

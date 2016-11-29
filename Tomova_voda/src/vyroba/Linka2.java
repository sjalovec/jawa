package vyroba;
//doplnit kontrolu na pocet zbozi na sklade pred voláním konstruktoru (nejlep jako metoda volana vstupní promenou)
import vyrobky.Dvoukolo;
import vyrobky.Liberta;
import vyrobky.Trikolka;
import vyrobky.TypVyrobku;
import vyrobky.VyrobkyIface;
import zbozicko.Kolo;
import zbozicko.Ram;
import zbozicko.Sedlo;

public class Linka2 {
    public static VyrobkyIface vyrobVyrobek2(TypVyrobku model) {
        VyrobkyIface vyrobenyVyrobekzLinky = null;
        switch(model) {
            case LIBERTA:
                vyrobenyVyrobekzLinky = new Liberta(new Kolo(), new Kolo(), new Sedlo(), new Ram());
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
    
}

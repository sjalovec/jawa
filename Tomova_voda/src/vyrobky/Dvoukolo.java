package vyrobky;

import zbozicko.Kolo;
import zbozicko.Ram;
import zbozicko.Sedlo;

public class Dvoukolo implements VyrobkyIface {

    public Dvoukolo(int kolo, int ram, int sedlo) {
        //tady pak bude volání na odečet ze skladu na počet kusů potřebných pro volání???
    };
    String typ_vyrobku = "Dvoukolo";
    Kolo predni_kolo_dvoukolo;
    Kolo zadni_kolo_dvoukolo;
    Ram ram_dvoukolo;
    Sedlo sedlo_predni_dvoukolo;
    Sedlo sedlo_zadni_dvoukolo;
    
    @Override
    public void vypisText() {
        System.out.println("Já jsem dvoukolo, tzn. kolo pro dva. Dvě kola maj standardně všechny kola, ty tupče!");
    };
    
    @Override
    public void vypisTypVyrobku() {
        System.out.println("Typ výrobku: "+typ_vyrobku);
    };
}

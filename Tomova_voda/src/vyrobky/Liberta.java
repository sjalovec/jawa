package vyrobky;

import zbozicko.Kolo;
import zbozicko.Ram;
import zbozicko.Sedlo;
import zbozicko.TypZbozi;

public class Liberta extends VyrobkyIface{

    private static final String jmenoVyrobku = "Liberta";
   
    
    public Liberta(Kolo predni_kolo, Kolo zadni_kolo, Sedlo sedlo, Ram ram) {
        super(TypVyrobku.LIBERTA);
        vypisTypVyrobku();
    }

    @Override
    public void vypisText() {
        System.out.println("Tzn. běžné kolo pro jednoho.");
    }

    @Override
    public void vypisTypVyrobku() {
        System.out.println("Vyrábím výrobek: " + jmenoVyrobku);
    }
}

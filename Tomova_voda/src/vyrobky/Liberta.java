package vyrobky;

import zbozicko.Kolo;
import zbozicko.Ram;
import zbozicko.Sedlo;

public class Liberta extends VyrobkyIface{

    private static final String jmenoVyrobku = "Liberta";
   
    
    public Liberta() {
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

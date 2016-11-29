//je potřeba upravit, až bude vyřešeno dvoukolo + kolo + iface + program
package vyrobky;

import zbozicko.Kolo;
import zbozicko.Ram;
import zbozicko.Sedlo;

public class Liberta extends VyrobkyIface{

    private static final String jmenoVyrobku = "Liberta";
    
    public Liberta(Kolo p_kolo, Kolo z_kolo, Sedlo l_sedlo, Ram l_ram) {
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

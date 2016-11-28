//je potřeba upravit, až bude vyřešeno dvoukolo + kolo + iface + program
package vyrobky;

import zbozicko.Kolo;

public class Liberta extends VyrobkyIface{

    private static final String typ_vyrobku = "Liberta";
    
    public Liberta() { //dodelat doma ty pico
        super(TypVyrobku.LIBERTA);
        vypisTypVyrobku();
    }

    @Override
    public void vypisText() {
        System.out.println("Tzn. běžné kolo pro jednoho.");
    }

    @Override
    public void vypisTypVyrobku() {
        System.out.println("Vyrábím výrobek: " + typ_vyrobku);
    }
}

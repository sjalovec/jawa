package vyrobky;

public class Trikolka extends VyrobkyIface {

    private static final String typ_vyrobku = "Trikolka";

    public Trikolka() {
        super(TypVyrobku.TRIKOLKA);
        vypisTypVyrobku();

    };
    
    @Override
    public void vypisText() {
        System.out.println("Tzn. dětská hračka.");
    };
    
    @Override
    public void vypisTypVyrobku() {
        System.out.println("Vyrábím výrobek: " + typ_vyrobku);
    };
}

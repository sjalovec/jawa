package vyrobky;

public class Vyrobek {

    String jmenoVyrobku;

    //zapíše jmnéno třídy do proměnné jmenoVyrobku
    public void jmenoVyrobku() {
        jmenoVyrobku = this.getClass().getSimpleName(); //getSimpleName vytahne jmeno tridy bez package getname to veme i s pckg
    }

    public void vypisJmenoVyrobku() {
        System.out.println(jmenoVyrobku);
    }
}

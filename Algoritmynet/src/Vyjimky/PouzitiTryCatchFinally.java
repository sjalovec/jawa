package Vyjimky;

public class PouzitiTryCatchFinally {

    public static void main(String[] args) {

    }

    public static void catchExcept() {
        try {
            int a = 10 / 0; //vyvola exception na deleni nulou: java.lang.ArithmeticException
        } catch (RuntimeException e) {
            e.printStackTrace(); //vypise zasobnik
            System.out.println("Runtime exception odchycena.");
        } catch (Exception e) {
            e.printStackTrace(); //vypise zasobnik
            System.out.println("odchycena vyjimka tridy Exception");
            System.out.println("Tento blok se vypise, pokud nedojde k odchyceni" + "vyjimky v nejakem z predchozich bloku.");
        } finally {
            System.out.println("Obsah bloku finally bude zpracovan vzdy.");
        }
        System.out.println("Vyjimka byla zpracovana, zde muzeme pokracovat");
    }
}

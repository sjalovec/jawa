package Vlakna;
//vlákna se střídají po vteřinách, takže postupně přičítají do společného i +1. Při každým připočtení si zavolaj i
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizovaneMetody {

    private List list = new ArrayList();

    public static void main(String[] args) throws InterruptedException {
        //promenne vyuzivane ve vnitrnich tridach musi byt konecne (final)
        final SynchronizovaneMetody SM = new SynchronizovaneMetody(); //vytvoreni instance objektu Main (kvuli seznamu list)

        Thread t1 = new Thread() {

            @Override
            public void run() {
                for (int i = 0; i < 50; i += 2) {
                    synchronized (SM) {
                        SM.list.add(i);
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i < 50; i += 2) {
                    synchronized (SM) {
                        SM.list.add(i);
                    }
                }
            }
        };

        t1.start();
        t2.start();

        Thread.sleep(1000);
        Collections.sort(SM.list);
        SM.printList();
    }
    /*
     * Vypise obsah predaneho seznamu
     * Metoda je synchronizovana, u statickych metod je zamkem objekt obalujici tridy
     * u nestatickych metod obalujici objekt (pozor na tento zasadni rozdil)
     *
     * V tomto pripade se tedy jedna o synchronizaci nad objektem, ktery referencujeme
     * v programu jako "SM"
     */
    public synchronized void printList() {
        for (Object o : this.list) {
            System.out.println(o);
        }
    }
}

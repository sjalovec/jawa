package Vlakna;
//Demonstrace dvouvlaknove aplikace nad sdilenym seznamem s notifikaci vlaken

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KomunikaceVlaken {

    private List list = new ArrayList();

    public static void main(String[] args) throws InterruptedException {
        //promenne vyuzivane ve vnitrnich tridach musi byt konecne (final)
        final KomunikaceVlaken KV = new KomunikaceVlaken(); //vytvoreni instance objektu Main (kvuli seznamu list)

        Thread t1 = new Thread() {

            @Override
            public void run() {
                for (int i = 0; i < 50; i += 2) {
                    synchronized (KV) {
                        KV.list.add(i);
                    }
                }
                if (KV.list.size() == 50) {
                    synchronized (KV) {
                        KV.notify();
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i < 50; i += 2) {
                    synchronized (KV) {
                        KV.list.add(i);
                    }
                }
                if (KV.list.size() == 50) {
                    synchronized (KV) {
                        KV.notify();
                    }
                }
            }
        };

        t1.start();
        t2.start();

        synchronized (KV) {
            while (KV.list.size() != 50) { //spurious wakeup
                KV.wait(); //wait until notified
            }
        }

        Collections.sort(KV.list);
        KV.printList();
    }

    /*
     * Vypise obsah predaneho seznamu
     * Metoda je synchronizovana, u statickych metod je zamkem objekt obalujici tridy
     * u nestatickych metod obalujici objekt (pozor na tento zasadni rozdil)
     *
     * V tomto pripade se tedy jedna o synchronizaci nad objektem, ktery referencujeme
     * v programu jako "KV"
     */
    public synchronized void printList() {
        for (Object o : this.list) {
            System.out.println(o);
        }
    }

}

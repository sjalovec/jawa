package vyrobky;

import zbozicko.Kolo;
import zbozicko.Ram;
import zbozicko.Sedlo;

public class Dvoukolo implements VyrobkyIface {

    private static final String typ_vyrobku = "Dvoukolo";
    private Kolo predni_kolo;
    private Kolo zadni_kolo;
    private Ram ram;
    private Sedlo predni_sedlo;
    private Sedlo zadni_sedlo;

    public Dvoukolo(Kolo kolo_predni, Kolo kolo_zadni, Ram ram, Sedlo sedlo_predni, Sedlo sedlo_zadni) {
        Kolo k = new Kolo(kolo_predni);
        this.predni_kolo = kolo_predni;
        this.zadni_kolo = kolo_zadni;
        this.ram = ram;
        this.predni_sedlo = sedlo_predni;
        this.zadni_sedlo = sedlo_zadni;
    }
    /*
    @Override
    public void add(ENTITY i) {
        Node n = new Node(i);
        if (size == 0) {
            this.first = n;
            this.last = n;
        } else {
            this.last.next = n;
            this.last = n;
        }size++;

    private class Node {
        private ENTITY value;
        private Node next;
        private Node(ENTITY value) {
            this.value = value;
        }}
    */
    @Override
    public void vypisText() {
        System.out.println("Já jsem dvoukolo, tzn. kolo pro dva. Dvě kola maj standardně všechny kola, ty tupče!");
    }

    @Override
    public void vypisTypVyrobku() {
        System.out.println("Typ výrobku: " + typ_vyrobku);
    }
}

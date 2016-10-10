package GenerikaIterator;

public class HlavniTridaVolani {

    public static void main(String[] args) {
        ListIface<Integer> l = new MyLinkedList<Integer>();
        l.add(0);
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);

        System.out.println(l); //pouíváme toString

        for (Integer i : l) {
            System.out.print(i + " ");
        }
    }

}

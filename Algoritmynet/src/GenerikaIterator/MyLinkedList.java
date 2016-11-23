package GenerikaIterator;

import java.util.Iterator;

/**
 * Jednosmerne zretezeny spojovy seznam
 * @param <ENTITY> typovy parametr specifikujici ukladany typ
 */
public class MyLinkedList<ENTITY> implements ListIface<ENTITY> {

    private Node first;
    private Node last;
    private int size;

    /**
     * Konstruktor spojoveho seznamu
     */
    public MyLinkedList() {
        this.size = 0;
    }

    /**
     * Vlozi na konec seznamu prvek
     * @param i prvek k vlozeni
     */
    @Override
    public void add(ENTITY i) {
        Node n = new Node(i);
        if (size == 0) {
            this.first = n;
            this.last = n;
        } else {
            this.last.next = n;
            this.last = n;
        }
        size++;
    }

    /**
     * Vrati prvek na indexu i
     * @param i index prvku
     * @throws IndexOutOfBoundsException pokud je i vyssi nebo rovna delce seznamu
     * @throws IllegalArgumentException pokud je i zaporne
     * @return prvek na indexu i
     */
    @Override
    public ENTITY get(int i) {
        if (i >= size) {
            throw new IndexOutOfBoundsException("Mimo meze index:" + i + ", size:" + this.size);
        }
        if (i < 0) {
            throw new IllegalArgumentException("Index mensi nez 0");
        }
        Node curr = first;
        for (int j = 0; j < i; j++) {
            curr = curr.next;
        }
        return curr.value;
    }

    /**
     * Smaze prvek na indexu i
     * @param i index mazaneho prvku
     * @throws IndexOutOfBoundsException pokud je i vyssi nebo rovna delce seznamu
     * @throws IllegalArgumentException pokud je i zaporne
     */
    @Override
    public void remove(int i) {
        if (i >= size) {
            throw new IndexOutOfBoundsException("Mimo meze index:" + i + ", size:" + this.size);
        }
        if (i < 0) {
            throw new IllegalArgumentException("Index mensi nez 0");
        }
        if (i == 0) {
            first = first.next;
        } else {
            Node curr = first;
            for (int j = 0; j < i - 1; j++) { //najdeme predchozi
                curr = curr.next;
            }
            curr.next = curr.next.next; //a mazany prvek vynechame
            if (i == size - 1) { //pokud mazeme posledni
                last = curr;
            }
        }
        size--;
    }

    /**
     * Dotaz na delku seznamu
     * @return delka seznamu
     */
    @Override
    public int size() {
        return this.size;
    }

    /**
     * Klasicka toString metoda, vraci textovou reprezentaci objektu
     * @return textova reprezentace objektu
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node curr = first;
        for (int i = 0; i < this.size; i++) {
            builder.append(curr.value);
            builder.append(" ");
            curr = curr.next;
        }
        return builder.toString();
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator();
    }

    /**
     * Jednoduchy iterator pro spojovy seznam
     * Neresi situaci, kdy je iteratoru pod rukou pozmena kolekce (tj. neni fail fast)
     */
     private class LinkedListIterator implements Iterator<ENTITY> {

        private Node currNode;
        private boolean start;

        public LinkedListIterator() {
            this.currNode = null;
            this.start = true;
        }

        @Override
        public boolean hasNext() {
            if (start) {
                return first != null;
            }
            return currNode.next != null;
        }

        @Override
        public ENTITY next() {
            if (start) {
                start = false;
                currNode = first;
            } else {
                currNode = currNode.next;
            }
            return currNode.value;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Remove is not supported");
        }
    }

    /**
     * Vnitrni trida reprezentujici jeden uzel spojoveho seznamu
     */
    private class Node {

        private ENTITY value;
        private Node next;

        private Node(ENTITY value) {
            this.value = value;
        }
    }
}

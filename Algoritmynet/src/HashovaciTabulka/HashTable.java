package HashovaciTabulka;

public abstract class HashTable<KEY, VALUE> implements TableIface<KEY, VALUE> {

    //Pomer zaplneni pri kterem dojde k vytvoreni nove (vetsi) tabulky
    private final float LOAD_FACTOR = 0.75f;

    //Pomer zaplneni pri kterem dojde k vytvoreni nove (mensi tabulky)
    private final float COLAPSE_RATIO = 0.1f;

    //Hodnota, pod kterou nikdy neklesne velikost tabulky
    private final int INITIAL_CAPACITY;

    //počet uložených prvků
    private int size = 0;
    private Entry<KEY, VALUE>[] table;

    //Zkonstruuje hashovaci tabulku s vychozi kapacitou 10
    public HashTable() {
        this(10); //výchozí kapacita
    }

    //zkonstruuje hashovaci tabulku
    public HashTable(int initialCapacity) {
        //if (initialCapacity <= 0) {
        //    thrown new IllegalArgumentException("Kapacita nesmi byt mensi nez nula.");
        //}
        this.INITIAL_CAPACITY = initialCapacity;
        this.table = new Entry[initialCapacity];
    }

    private class Entry<KEY, VALUE> {

        private KEY key;
        private VALUE value;
    }

}

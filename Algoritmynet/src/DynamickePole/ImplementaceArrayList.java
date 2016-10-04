package DynamickePole;

public class ImplementaceArrayList {

    public static void main(String[] args) {
        //volání arraylistu
        ImplementaceArrayList list = new ImplementaceArrayList(10);
        list.pridejPrvek(4);
        list.pridejPrvek(5);
        list.pridejPrvek(6);
        System.out.println(list); //toString metoda ?????

        System.out.println(list.vratHodnotu(2)); //mělo by vypsat 6?
        System.out.println(list.vratHodnotu(3)); //2147483647 == Integer.MAX_VALUE
        System.out.println(list.getSize()); //vratí 3 = velikost pole

        list.odstranPrvek(0);

        System.out.println(list);
        System.out.println(list.vratHodnotu(0)); //vrati 6 - doslo k prohozeni
    }

    private final int defaultSize;
    private int size;
    private int[] mojePole;

    //konstruktor  - výchozí kapacita je 4
    public ImplementaceArrayList() {
        this(4);
    }

    // Konstruktor, lze nastavit vychozi delku listu, pod tuto nebude nikdy zkracen
    // @param size
    public ImplementaceArrayList(int size) {
        this.size = 0;
        this.defaultSize = size;
        mojePole = new int[size];
    }

    //metoda enlarge, zdvojnásobí velikost pole
    private void zvetsiPole() {
        int[] noveDynPole = new int[size * 2];
        for (int i = 0; i < size; i++) {
            noveDynPole[i] = mojePole[i];
        }
        mojePole = noveDynPole;
    }

    //zmenšení pole o půlku, pokud je zaplněno méně než 1/4 kapacity
    private void zmensiPole() {
        if ((mojePole.length / 4) > size && mojePole.length / 2 >= defaultSize) {
            int[] noveDynPole2 = new int[mojePole.length / 2];
            for (int i = 0; i < size; i++) {
                noveDynPole2[i] = mojePole[i];
            }
            this.mojePole = noveDynPole2;
        }
    }

    //metoda add - pridani prvku do arraylistu
    private void pridejPrvek(int i) {
        if (size == mojePole.length) {
            this.zvetsiPole();
        }
        mojePole[size] = i;
        size++;
    }

    //metoda remove - odstraní prvek z pole
    public void odstranPrvek(int index) {
        mojePole[index] = mojePole[size - 1];
        size--;
        zmensiPole();
    }

    //metoda get - vrátí prvek z pole na určitém indexu (hodnota kterou vkládá uživatel
    public int vratHodnotu(int index) {
        if (index >= size) {
            return Integer.MAX_VALUE;
        }
        return mojePole[index];
    }

    //metoda co vraci hodnotu size
    public int getSize() {
        return size;
    }

    //metoda, co vraci hodnotu defaultSize
    public int getDefaultSize() {
        return defaultSize;
    }

}

package DynamickePole;

public class ImplementaceArrayList {
    public static void main(String[] args) {      
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
        int[] noveDynPole = new int [size * 2];
        for (int i = 0; i < size; i++) {
            noveDynPole[i] = mojePole[i];
        }
    mojePole = noveDynPole;    
    }
    
    //zmenšení pole o půlku, pokud je zaplněno méně než 1/4 kapacity
    private void zmensiPole() {
        if ((mojePole.length / 4) > size && mojePole.length / 2 >= defaultSize) {
            int[] noveDynPole2 = new int [mojePole.length / 2];
            for (int i = 0; i < size; i++) {
                noveDynPole2 [i] = mojePole [i];
            }
    this.mojePole = noveDynPole2;        
        }
    }
    
}

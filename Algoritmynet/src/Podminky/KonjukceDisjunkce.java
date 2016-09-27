package Podminky;

public class KonjukceDisjunkce {

    public static void main(String[] args) {
        /*
        * Vyhodnocovani &, &&, | a || *
         */
        System.out.println(returnFalse() & returnTrue()); //vyhodnoti se oboji
        System.out.println("");
        System.out.println(returnFalse() && returnTrue()); //pouze prvni cast
        System.out.println("");
        System.out.println(returnTrue() | returnFalse()); //vyhodnoti se oboji
        System.out.println("");
        System.out.println(returnTrue() || returnFalse()); //pouze prvni cast
        System.out.println("");
        //slozeny vyraz, vyhodnoti se vse, vypise true
        System.out.println((returnTrue() && returnFalse()) | !returnFalse());
        
    }
        /* Vypise retezec "returnFalse" na konzoli a vrati false
        * Metoda je staticka, protoze nevytvarime zadnou instanci, volame tuto
        * metodu ze statickeho kontextu metody main (vstupni bod aplikace)
        * Pokud bychom tuto metudu chteli mit instancni, pak bychom odstranili slovo
        * static a v metode main vytvorili instanci tohoto objektu (zkuste)
        * @return vzdy @false
         */
     
    public static boolean returnFalse() {
        System.out.println("returnFalse");
        return false;
    }

    /**
     * Vypise retezec "returnTrue" na konzoli a vrati true
     *
     * @return vzdy @true
     */
    public static boolean returnTrue() {
        System.out.println("returnTrue");
        return true;
    }

}

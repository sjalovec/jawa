package Cykly;

public class CyklusDoWhile {
    public static void main(String[] args) {
    //euklid(133,15); //moje volání, nneí potřeba pro sout
        System.out.println("výsledek je: "+euklid(133,15)); //vypise na obrazovku výsledek pocítaní, podle vložených promenných
    }
    public static int euklid (int a, int b){
            if (a < 1 || b < 1) return -1;
            
            int spolecnyDelitel = 0;
            int remajdr = 0;
            
            do{
                remajdr = a % b; //v tento okamžik v poslední iteraci platí ona podmínka, ze zbytku 0
                a = b; //pro jistotu posuneme dal
                b = remajdr; //v b je proto 0, v a je euklid
            }while (b != 0);
            return a;
        }
}
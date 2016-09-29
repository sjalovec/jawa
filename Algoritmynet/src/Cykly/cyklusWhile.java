
package Cykly;

public class cyklusWhile {
    public static void main(String[] args) {
        System.out.println("Výsledek je: "+faktorial(5)); //moje volání dodatčně přidáné
    }
    public static double faktorial(int nr){
        if(nr<0) return -1;
        double result = 1;
        int i = 2;
        while (i <= nr){
            result *= i;
            i++;
        }
        return result;
    }

}

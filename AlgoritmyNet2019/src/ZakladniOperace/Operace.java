package ZakladniOperace;

public class Operace {
    public static void main(String[] args) {
        int a = 5; //deklarace v hlavní třídě
        System.out.println(a);
        {
            int b = 10; //deklarace uvnitř bloku
            System.out.println(a); //print uvnitř bloku, ale deklarováno o úroveň výš
            System.out.println(b); //print uvnitř bloku deklarované uvnitř bloku
        }
        //System.out.println(b); //toto by nemělo fungovat, print hodnoty mimo blok
    
    int x = 1;
    int y = 1;
    double c = ((double) x+y)/4; //druhy double tam musi byt, aby to vyslo s desetinou carkou
    System.out.println(c);
    
    int munice = 50;
    int kapacita = 9;
    int vysledek = 50 % 9;
        System.out.println(vysledek);
    
    }
    
}


import java.util.Scanner;
import vyrobky.TypVyrobku;

public class VstupUziv {

    public static TypVyrobku vratVyber() {
        System.out.println("\nVyber číslem, co chceš vyrobit:");
        System.out.println("1: Liberta");
        System.out.println("2: Dvoukolo");
        System.out.println("3: Trikolka");
        Scanner sc = new Scanner(System.in);
        int vyber = sc.nextInt();
        switch(vyber) {
            case (1):
                System.out.println("Výběr: "+vyber);
                return TypVyrobku.LIBERTA;
            case(2):
                System.out.println("Výběr: "+vyber);
                return TypVyrobku.DVOUKOLO;
            case(3):
                System.out.println("Výběr: "+vyber);
                return TypVyrobku.TRIKOLKA;
            default:
                System.out.println("Vstup není platný.");
        }
        return null;
    }
}

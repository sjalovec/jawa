package Cykly;

public class BreakContinue {
    public static void main(String[] args) {
        //vypise licha cisla
        for (int i = 1; i <= 10; i++){
            if (i % 2 == 0) continue;
                System.out.println(i);
        }
        
        //vypise cisla 1-6
        for (int j = 0; j<=10; j++){
            if (j==7) break; //break ukončí cyklus
            System.out.println(j);
        }
    }

}

package Vyjimky;
//ma najit zadanou promenou v poli pomocí rekurze

public class ukolOdTJPoleHledani {

    static int[] poleHodnotRek = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
    static int R = (poleHodnotRek.length - 1); //prava strana (maximum pole)
    static int L = 0;  //leva strana pole (minimum)
    static int i = 0;
    static int j = 5;

    public static void main(String[] args) {
        //volání metody
        rekurzePole(13);

    }

    public static int rekurzePole(int vstupniHodnota) {
        if (vstupniHodnota > poleHodnotRek[L] && vstupniHodnota < poleHodnotRek[R / 2]) {
            R = R / 2;
            i++;
            rekurzePole(vstupniHodnota);
        } else if (vstupniHodnota > poleHodnotRek[(L + R) / 2] && vstupniHodnota < poleHodnotRek[R]) {
            L = ((L + R) / 2);
            j++;
            i = j;
            //System.out.println("jsem vetsi hodnota");
            rekurzePole(vstupniHodnota);
        } else {
            System.out.println("Číslo je na pozici: " + i);
        }
        return 0;
    }

    public static int rekurzeTestCyklus(int cisloCoHledam) {
        int[] poleHodnot = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int pomProm = 0;
        for (int i = 0; i < poleHodnot.length; i++) {
            if (poleHodnot[i] == cisloCoHledam) {
                //System.out.println("Tvoje cislo je na pozici: "+i);
                pomProm = i;
                break;
            } else //System.out.println("Tvoje cislo neni v seznamu");
            {
                continue;
            }
        }
        System.out.println("Tvoje cislo je: " + cisloCoHledam + " a je na pozici: " + pomProm);
        return 0;
    }
}

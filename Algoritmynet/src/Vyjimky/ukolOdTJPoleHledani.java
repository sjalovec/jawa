package Vyjimky;
//ma najit zadanou promenou v poli pomocí rekurze

public class ukolOdTJPoleHledani {

    public static void main(String[] args) {
        //volání metody
        rekurzePole(5);

    }

    public static int rekurzePole(int vstupniHodnota) {
        int[] poleHodnotRek = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int i;
        int R = (poleHodnotRek.length-1); //prava strana (maximum pole)
        int L = 0;  //leva strana pole (minimum)
        if (vstupniHodnota < poleHodnotRek[R]) {
            R = R/2;
            System.out.println("jsem mensi hodnota: "+poleHodnotRek[poleHodnotRek.length/2]);
            System.out.println("a index pole je: "+poleHodnotRek.length/2);
            System.out.println("pole na indexu length-1: "+poleHodnotRek[poleHodnotRek.length-1]);
            //rekurzePole(vstupniHodnota);
        }
        else if (vstupniHodnota > poleHodnotRek[L]) {
            L = L/2;
            System.out.println("jsem vetsi hodnota");
            //rekurzePole(vstupniHodnota);
        }
        else {
            System.out.println("Číslo je na pozici: ");
        }

        //System.out.println(poleHodnotRek[poleHodnotRek.length / 2]); //tohle mi vypise prostřední prvek z pole
        /*
        if bude na vetsi
        else if bude na mensi
        else bude vypisovat, pokud se nesplni nic z predchoziho
        */
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

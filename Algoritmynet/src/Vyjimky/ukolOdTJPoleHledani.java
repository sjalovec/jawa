package Vyjimky;
//ma najit promenou v poli pomocí rekurze

public class ukolOdTJPoleHledani {

    public static void main(String[] args) {
        //volání metody
        rekurzeTestCyklus(5);

    }
/*
    public static int rekurzePole(int vstupniHodnota) {
        int[] poleHodnotRek = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
    }
*/
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

package facpat;

import factory.ProductionLineDef;
import java.util.Scanner;
import products.ProductIface;

public class FacPat {

    public static void main(String[] args) {

        System.out.println("\nVyber číslem, co chceš vyrobit:");
        System.out.println("1: Liberta");
        System.out.println("2: Dvoukolo");
        System.out.println("3: Trikolka");
        Scanner sc = new Scanner(System.in);
        int vyber = sc.nextInt();
        switch (vyber) {
            case (1):
                System.out.println("Výběr: " + vyber);

                ProductionLineDef PL_Liberta = new ProductionLineDef();
                ProductIface PI_Liberta = PL_Liberta.getProductType("Liberta"); //WTF konstrukce
                PI_Liberta.manufacture_product();
                break;
            case (2):
                System.out.println("Výběr: " + vyber);
            
                ProductionLineDef PL_Dvoukolo = new ProductionLineDef();
                ProductIface PI_Dvoukolo = PL_Dvoukolo.getProductType("Dvoukolo");
                PI_Dvoukolo.manufacture_product();
                break;
            case (3):
                System.out.println("Výběr: " + vyber);
            
                ProductionLineDef PL_Trikolka = new ProductionLineDef();
                ProductIface PI_Trikolka = PL_Trikolka.getProductType("Trikolka");
                PI_Trikolka.manufacture_product();
                break;
            default:
                System.out.println("Vstup není platný.");
        }

    }

}
/*
jakože shapeFactory akorat urcuje jaka linka se bude pouzivat?
a pak tam mas konkrítní 3 linky, který maj napsany, co presne delaj
-ano
*/

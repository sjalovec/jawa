/*
hotovo?
 */
package facpat;

import factory.ProductionLineDef;
import static factory.ProductionLineDvoukolo.NumberOfDvoukolo;
import static factory.ProductionLineLiberta.NumberOfLiberta;
import static factory.ProductionLineTrikolka.NumberOfTrikolka;
import java.util.Scanner;
import products.ProductIface;

public class FacPat {

    public static void main(String[] args) {
        boolean vyrobaJede = true;
        while (vyrobaJede == true) {
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
            System.out.println("Celkem vyrobeno:");
            System.out.println(NumberOfLiberta + " ks výrobku Liberta.");
            System.out.println(NumberOfDvoukolo + " ks výrobku Dvoukolo.");
            System.out.println(NumberOfTrikolka + " ks výrobku Trikolka.");
            vyrobaJede = ProductionLineDef.continueProduction();
        }
    }

}
/*
jakože shapeFactory akorat urcuje jaka linka se bude pouzivat?
a pak tam mas konkrítní 3 linky, který maj napsany, co presne delaj
-ano
 */

package factory;

import static factory.ProductionLineDvoukolo.NumberOfDvoukolo;
import static factory.ProductionLineLiberta.NumberOfLiberta;
import static factory.ProductionLineTrikolka.NumberOfTrikolka;
import java.util.Scanner;
import products.ProductIface;

public class ProductionLineDef {

    public ProductIface getProductType(String productType) {
        if (productType == null) {
            return null;
        }
        if (productType.equalsIgnoreCase("LIBERTA")) {
            return ProductionLineLiberta.produceLiberta(); //return OP
        } else if (productType.equalsIgnoreCase("DVOUKOLO")) {
            return ProductionLineDvoukolo.produceLDvoukolo();
        } else if (productType.equalsIgnoreCase("TRIKOLKA")) {
            return ProductionLineTrikolka.produceTrikolka();
        }
        return null;
    }

    public static boolean continueProduction() {
        System.out.println("Pokračovat ve výrobě? A/N");
        Scanner sc = new Scanner(System.in);
        String vyber = sc.nextLine();
        switch (vyber) {
            case "A":
                return true;
            case "a":
                return true;
            case "Y":
                return true;
            case "y":
                return true;
            case "N":
                System.out.println("Celkem vyrobeno:");
                System.out.println(NumberOfLiberta + " ks výrobku Liberta.");
                System.out.println(NumberOfDvoukolo + " ks výrobku Dvoukolo.");
                System.out.println(NumberOfTrikolka + " ks výrobku Trikolka.");
                return false;
            case "n":
                System.out.println("Celkem vyrobeno:");
                System.out.println(NumberOfLiberta + " ks výrobku Liberta.");
                System.out.println(NumberOfDvoukolo + " ks výrobku Dvoukolo.");
                System.out.println(NumberOfTrikolka + " ks výrobku Trikolka.");
                return false;
            default:
                return false;
        }
    }
}

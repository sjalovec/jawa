package factory;

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
                return false;
            case "n":
                return false;
            default:
                return false;
        }
    }
}

package facpat;

import factory.Production_Line;
import products.Product_Iface;

public class FacPat {

    public static void main(String[] args) {
        Production_Line PL = new Production_Line();
        
        Product_Iface PI = PL.getProductType("Liberta"); //WTF konstrukce
        PI.manufacture_product();
    }
    
}

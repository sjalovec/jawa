package factory;

import products.Dvoukolo;
import products.Liberta;
import products.Product_Iface;
import products.Trikolka;

public class Production_Line {
    public Product_Iface getProductType(String productType){
        if (productType == null){
            return null;
        }
        if(productType.equalsIgnoreCase("LIBERTA")){
            return new Liberta();
        }
        else if(productType.equalsIgnoreCase("DVOUKOLO")){
            return new Dvoukolo();
        }
        else if(productType.equalsIgnoreCase("TRIKOLKA")){
            return new Trikolka();                   
        }
        return null; 
    }
}
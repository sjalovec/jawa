package factory;

import products.Dvoukolo;
import products.Liberta;
import products.Product_Iface;

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
        return null; 
    }
}
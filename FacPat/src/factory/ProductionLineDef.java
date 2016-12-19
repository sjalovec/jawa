package factory;

import products.ProductIface;

public class ProductionLineDef {
    public ProductIface getProductType(String productType){
        if (productType == null){
            return null;
        }
        if(productType.equalsIgnoreCase("LIBERTA")){
            return ProductionLineLiberta.produceLiberta(); //return OP
        }
        else if(productType.equalsIgnoreCase("DVOUKOLO")){
            return ProductionLineDvoukolo.produceLDvoukolo();
        }
        else if(productType.equalsIgnoreCase("TRIKOLKA")){
            return ProductionLineTrikolka.produceTrikolka();                   
        }
        return null; 
    }
}
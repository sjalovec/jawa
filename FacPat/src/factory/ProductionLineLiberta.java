package factory;

import products.Liberta;
import products.ProductIface;

public class ProductionLineLiberta {

    public static ProductIface produceLiberta() {
        return new Liberta();
    }
}

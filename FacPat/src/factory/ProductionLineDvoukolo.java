package factory;

import products.Dvoukolo;
import products.ProductIface;

public class ProductionLineDvoukolo {

    public static ProductIface produceLDvoukolo() {
        return new Dvoukolo();
    }
}

package factory;

import products.ProductIface;
import products.Trikolka;

public class ProductionLineTrikolka {

    public static ProductIface produceTrikolka() {
        return new Trikolka();
    }
}

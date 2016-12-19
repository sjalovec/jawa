package factory;

import products.Liberta;
import products.ProductIface;
import storage.StorageStatus;

public class ProductionLineLiberta {

    public static ProductIface produceLiberta() {
        StorageStatus.checkStorageLiberta();
        return new Liberta();
    }
}

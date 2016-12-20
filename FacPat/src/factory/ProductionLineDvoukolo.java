package factory;

import products.Dvoukolo;
import products.ProductIface;
import storage.OrderGoodsDvoukolo;
import storage.StorageStatus;

public class ProductionLineDvoukolo {

    public static int NumberOfDvoukolo = 0;

    public static ProductIface produceLDvoukolo() {
        if (StorageStatus.checkStorageDvoukolo() == true) {
            StorageStatus.useGoodsDvoukolo();
            NumberOfDvoukolo++;
            return new Dvoukolo();
        } else {
            OrderGoodsDvoukolo.orderAllGoods();
            StorageStatus.useGoodsDvoukolo();
            NumberOfDvoukolo++;
            return new Dvoukolo();
        }
    }
}

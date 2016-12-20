package factory;

import products.Liberta;
import products.ProductIface;
import storage.OrderGoodsLiberta;
import storage.StorageStatus;

public class ProductionLineLiberta {

    public static int NumberOfLiberta = 0;

    public static ProductIface produceLiberta() {

        if (StorageStatus.checkStorageLiberta() == true) {
            StorageStatus.useGoodsLiberta();
            NumberOfLiberta++;
            return new Liberta();
        } else {
            OrderGoodsLiberta.orderAllGoods();
            StorageStatus.useGoodsLiberta();
            NumberOfLiberta++;
            return new Liberta();
        }

    }
}

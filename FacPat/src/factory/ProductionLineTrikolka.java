package factory;

import products.ProductIface;
import products.Trikolka;
import storage.OrderGoodsTrikolka;
import storage.StorageStatus;

public class ProductionLineTrikolka {

    public static int NumberOfTrikolka = 0;

    public static ProductIface produceTrikolka() {
        if (StorageStatus.checkStorageTrikolka() == true) {
            StorageStatus.useGoodsTrikolka();
            NumberOfTrikolka++;
            return new Trikolka();
        } else {
            OrderGoodsTrikolka.orderAllGoods();
            StorageStatus.useGoodsTrikolka();
            NumberOfTrikolka++;
            return new Trikolka();
        }
    }
}

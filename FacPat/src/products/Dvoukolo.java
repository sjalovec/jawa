package products;

import goods.Kolo;
import goods.Ram;
import goods.Sedlo;

public class Dvoukolo implements ProductIface{
    @Override
    public void manufacture_product(){
        System.out.println("Jsem v dvoukolo.");
        //volání na použití komponent
        Kolo frontWheel = new Kolo();
        frontWheel.use_goods();
        Kolo rearWheel = new Kolo();
        rearWheel.use_goods();
        Ram frameLiberta = new Ram();
        frameLiberta.use_goods();
        Sedlo frontSeat = new Sedlo();
        frontSeat.use_goods();
        Sedlo rearSeat = new Sedlo();
        rearSeat.use_goods();
    }
}

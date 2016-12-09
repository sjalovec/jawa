package products;

import goods.Kolo;
import goods.Ram;
import goods.Sedlo;

public class Liberta implements Product_Iface{
    @Override
    public void manufacture_product(){
        System.out.println("Jsem v liberta.");
        //volání na použití komponent
        Kolo frontWheel = new Kolo();
        frontWheel.use_goods();
        Kolo rearWheel = new Kolo();
        rearWheel.use_goods();
        Ram frameLiberta = new Ram();
        frameLiberta.use_goods();
        Sedlo seat = new Sedlo();
        seat.use_goods();
    }
}

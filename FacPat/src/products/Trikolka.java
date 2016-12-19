package products;

import goods.Kolo;
import goods.Ram;
import goods.Sedlo;

public class Trikolka implements ProductIface{
    @Override
    public void manufacture_product(){
        System.out.println("Jsem v Trikolka.");
        //volání na použití komponent
        Kolo frontWheel = new Kolo();
        frontWheel.use_goods();
        Kolo rearWheelRight = new Kolo();
        rearWheelRight.use_goods();
        Kolo rearWheelLeft = new Kolo();
        rearWheelLeft.use_goods();
        Ram frameLiberta = new Ram();
        frameLiberta.use_goods();
        Sedlo seat = new Sedlo();
        seat.use_goods();
    }
    
}

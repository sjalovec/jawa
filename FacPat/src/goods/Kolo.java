package goods;

public class Kolo implements Goods_Iface{
    @Override
    public void use_goods(){
        System.out.println("Používám kolo ze skladu.");       
    }
}

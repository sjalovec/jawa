package goods;

public class Sedlo implements Goods_Iface{

    @Override
    public void use_goods() {
        System.out.println("Používám sedlo ze skladu.");
    }
    
}

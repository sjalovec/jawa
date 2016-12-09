package goods;

public class Ram implements Goods_Iface{
    @Override
    public void use_goods(){
        System.out.println("Používám ram ze skladu.");
    }
}

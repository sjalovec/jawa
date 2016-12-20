package products;

public class Dvoukolo implements ProductIface {

    @Override
    public void manufacture_product() {
        System.out.println("Vyrábím výrobek Dvoukolo.");
        //volání na použití komponent je ve tride StorageStatus     
    }
}

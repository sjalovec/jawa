package products;

public class Liberta implements ProductIface {

    @Override
    public void manufacture_product() {
        System.out.println("Vyrábím výrobek Liberta.");
        //volání na použití komponent je ve tride StorageStatus
    }
}

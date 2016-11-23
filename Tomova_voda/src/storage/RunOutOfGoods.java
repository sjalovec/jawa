package storage;

public class RunOutOfGoods extends Exception{

    public RunOutOfGoods() {
        System.out.println("Není dostatek zboží!");  
    };  
}

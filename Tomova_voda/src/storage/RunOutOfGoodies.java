package storage;

public class RunOutOfGoodies extends Exception{

    public RunOutOfGoodies() {
        System.out.println("Není dostatek zboží!");  
    };  
}

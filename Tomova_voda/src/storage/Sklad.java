package storage;
//potřeba dořešit
import static storage.Sklad.runOutOfGoods;

public class Sklad {

    public void odeberZbozi(zbozicko.Zbozi) throws Exception {
        runOutOfGoods();
    }

    public static void runOutOfGoods() throws Exception {
        throw new Exception("Zboží není skladem");
    }
}

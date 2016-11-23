//main je tady, hlavne ted na zkouseni 
import vyrobky.Dvoukolo;
import zbozicko.Kolo;
import zbozicko.Ram;
import zbozicko.Sedlo;

public class Program {

    public static void main(String[] args) {
        Dvoukolo dk = new Dvoukolo(new Kolo(), new Kolo(), new Ram(), new Sedlo(), new Sedlo());
        dk.vypisText();
        dk.vypisTypVyrobku();
    }

}

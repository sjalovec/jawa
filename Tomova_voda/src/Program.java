//main je tady, hlavne ted na zkouseni 
import vyrobky.Dvoukolo;
import zbozicko.Kolo;
import zbozicko.Ram;
import zbozicko.Sedlo;

public class Program {

    public static void main(String[] args) {
        Dvoukolo dk = new Dvoukolo(new Kolo kolo_predni, new Kolo kolo_zadni, new Ram ram, new Sedlo sedlo_predni, new Sedlo sedlo_zadni);
        dk.vypisText();
        dk.vypisTypVyrobku();
    }

}

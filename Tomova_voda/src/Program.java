//main je tady, hlavne ted na zkouseni 

import vyrobky.Dvoukolo;
import vyrobky.Liberta;
import vyrobky.Trikolka;
import zbozicko.Kolo;
import zbozicko.Ram;
import zbozicko.Sedlo;

public class Program {

    public static void main(String[] args) {
        Dvoukolo dk = new Dvoukolo(new Kolo(), new Kolo(), new Ram(), new Sedlo(), new Sedlo());
        dk.vypisTypVyrobku();
        dk.vypisText();

        Liberta l = new Liberta(new Kolo(), new Kolo(), new Ram(), new Sedlo());
        l.vypisTypVyrobku();
        l.vypisText();
        
        Trikolka tk = new Trikolka(new Kolo(), new Kolo(), new Kolo(), new Ram(), new Sedlo());
        tk.vypisTypVyrobku();
        tk.vypisText();

    }

}

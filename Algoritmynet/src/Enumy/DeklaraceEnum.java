package Enumy;

import java.util.Random;

public class DeklaraceEnum {
    public static void main(String[] args) {
        Mesic m0 = Mesic.Leden; //instance odpovidajici lednu
        Mesic m1 = Mesic.getRandom(); //náhodná instance
        System.out.println(m1); //vytiskne, který mesic jsme dostali v getRandom()
    }

}

enum Mesic {
    Leden, Unor, Brezen, Duben, Kveten, Cerven, Cervenec, Srpen, Zari, Rijen, Listopad, Prosinec;
    
    public static Mesic getRandom() {
        Random r = new Random(); //pseudonáhodný výběr
        int count = Mesic.values().length; //počet hodnot v enumu je uloženo do promenné count = 12
        System.out.println(count);
        return Mesic.values()[r.nextInt(count)]; 
        /* 
použití "r.nextInt(count)" vrátí náhodné číslo, na tomto místě v poli se pak zavolá mesic
*/
    }
}
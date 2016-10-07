package ZanoreneTypy;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;

public class LokalniTrida {
    public static void main(String[] args) {
        String[] poleHodnot = {"žluťoučký kůň", "dědek", "Máj", "májka", "chalupa", "cihla", "řízek", "Řezno"};
        
        //vnitřní třída
        class porovnavac implements Comparator {
            public int compare (Object o1, Object o2) {
                Collator c = Collator.getInstance(new Locale("cs", "CZ"));
                return c.compare(o1, o2);
            }
        }
        Arrays.sort(poleHodnot, new porovnavac());
        
        for (String s : poleHodnot) {
            System.out.println(s);
        }
    }

}

package unitTests;

import storage.Sklad;

public class VstupUzivUtest {
    public static void objednejZboziTest(){
        //String zbozi = "kolo";
        System.out.println("\ntest objednání zobží");
        Sklad.objednejZbozi("kolo", 1);
        
    };
}

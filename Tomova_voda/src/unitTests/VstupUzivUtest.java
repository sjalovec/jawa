package unitTests;

import storage.Sklad;

public class VstupUzivUtest {
    public static void objednejZboziTest(){
        //String zbozi = "kolo";
        System.out.println("\nZačínají unit testy");
        //objedná 1 kolo
        Sklad.objednejZbozi("kolo", 1);
        //objedná 2 rámy
        Sklad.objednejZbozi("ram", 2);
        
    };
}

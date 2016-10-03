package Pole;

public class JednoRozPole {
    public static void main(String[] args) {
        int[] array = new int[8];
        array[0] = 5; //uloží hodnotu na první pozici
        array[1] = 3; //na druhé pozici je uložená 3
        array[2] = array[1]; //do třetí pozice uložíme hodnotu na pozici 2 tedy hodnotu 3
        array[1] = 4; //aktuálně ma array[1] == 4 a array[2] == 3
        
        //pole retezcu (string)
        String[] stringArray = new String[4];
        stringArray[0] = "Skákal";
        stringArray[1] = "pes";
        stringArray[2] = "pres";
        stringArray[3] = "oves";
        System.out.println(stringArray[0]); //vypise Skákal
        
        //standardní inicializace
        String[] stringArray2 = {"Skákal", "pes", "přes", "oves"};
        System.out.println(stringArray2[0]);
    }
}

package spojseznam;

public class SpojSeznam {

    public static void main(String[] args) {
        MujLink3dList ml = new MujLink3dList();
        ml.add(0); //tohle hodí int 0 na pozici 0
        ml.add(1); //tohle hodi int 1 na pozici 1
        ml.add(2); //int 2 na pozici 2
        ml.add(3); //int 3 na pozici 3
        ml.add(4); //int 4 na pozici 4
        ml.add(5); //int 5 na pozici 5
        System.out.println("velikost listu pred remove: "+ml.size());
        ml.remove(3);
        //System.out.println("hodnota na indexu 2: "+ml.get(2)); //mělo by vrátit 2
        System.out.println("hodnota na indexu 3: "+ml.get(3)); //mělo by vrátit 4
        System.out.println("Velikost listu po remove: "+ml.size());
        
        System.out.println("Nastavuji hodnotu 10 na index 2");
        ml.insertAt(2, 10);
        System.out.println("hodnota na indexu 0: "+ml.get(0));
        System.out.println("Hodnota na indexu 1: "+ml.get(1));
        System.out.println("hodnota na indexu 2: "+ml.get(2));
        System.out.println("Velikost listu: "+ml.size());
        ml.insertAfter(3, 99);
        System.out.println(ml.get(0));
        System.out.println(ml.get(1));
        System.out.println(ml.get(2));
        System.out.println(ml.get(3));
        System.out.println(ml.get(4));
        //System.out.println(ml.get(5));
        System.out.println("velikost listu " +ml.size());
      
    }
    
}

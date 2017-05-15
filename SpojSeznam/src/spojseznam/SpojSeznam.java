package spojseznam;

public class SpojSeznam {

    public static void main(String[] args) {
        MujLink3dList ml = new MujLink3dList();
        ml.add(0); //tohle hodí int 0 na pozici 0
        ml.add(1); // tohle hodi int 1 na pozici 1
        ml.add(2); //int 2 na pozici 2
        ml.add(3); //int 3 na pozici 3
        ml.add(4); // int 4 na pozici 4
        ml.add(5); //int 5 na pozici 5
        System.out.println("velikost pole pred remove: "+ml.size());
        //ml.get(1);
        ml.remove(3);
        System.out.println("hodnota na indexu 2: "+ml.get(2)); //mělo by vrátit 2
        System.out.println("hodnota na indexu 3: "+ml.get(3)); //mělo by vrátit 4
        System.out.println("Velikost pole: "+ml.size());
        //System.out.println(ml.get(5)); //mělo by hodit chybu
        ml.insertAt(1, 10);
        System.out.println(ml.get(0));
        System.out.println(ml.get(1));
        System.out.println(ml.get(2));
      
    }
    
}

package spojseznam;

public class SpojSeznam {

    public static void main(String[] args) {
        MujLink3dList ml = new MujLink3dList();
        ml.add(6); //tohle hodí int 6 na pozici 0
        ml.add(3); // tohle hodi int 3 na pozici 3
        ml.get(1);
        ml.remove(20);
       // System.out.println(ml.get(1));
        System.out.println(ml.size());
        
    }
    
}

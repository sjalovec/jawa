
package Objekty;

public class TridaString {
    public static void main(String[] args) {
        String s = "Skákal pes přes oves."; //toto je string
        String x = s.substring(0,6); //prvních 6 znaku
        System.out.println(x); //vypíše skákal
        String y = x + " psík"; //spojí víc řetězců
        System.out.println(y); //vypíše skákal psík
    }
    
}


package Podminky;


public class TernarniOperator {
    public static void main(String[] args) {
        
        System.out.println(generateGreeting(true, false));       
    }
public static String generateGreeting(boolean male, boolean married){
            String base = "Dear ";
            if(male){
                return base + "Mr.";
            }else{
                return base + (married ? "Mrs." : "Ms.");
            }
        }
}

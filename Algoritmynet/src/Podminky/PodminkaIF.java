
package Podminky;

public class PodminkaIF {
    public static void main(String[] args) {
        int i = 5; //tady si můžu dát na test co chci
        //int n;
        
        if (i % 3 == 0){
            System.out.println("číslo je dělitelné třemi"); //pokud i = 3, tak vypíše text
        }
        
        if (i % 3 == 0){
            System.out.println("číslo je dělitelné třemi"); //pokud i = 3, tak vypíše text
        }else{
            System.out.println("číslo není dělitelné třemi");//jinak vypíše tento text
        }
        
        if (i % 3 == 0){
            System.out.println("číslo je dělitelné třemi"); //pokud i = 3, tak vypíše text
        }else if(i % 2 == 0){
            System.out.println("Číslo je sudé"); //pokud lze dělit dvěma bez zbytku vypíše toto
        }else{
            System.out.println("číslo není dělitelné třemi, ani není sudé");//jinak vypíše toto
        }
    }

}

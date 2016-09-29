package Podminky;

public class Switch {
    public static void main(String[] args) {
        int day = (int) (Math.random() * 7); //mělo by vygenerovat číslo 0 - 6       
        System.out.println(day);
        switch (day){
            case 0:
                System.out.println("je Pondělí");
                break;
            case 1:
                System.out.println("je úterý");
                break;    
            case 2:
                System.out.println("je středa");
                break;
            case 3:
                System.out.println("je čtvrtek");
                break;
            case 4:
                System.out.println("je pátek");
                break;
            case 5:
                System.out.println("je sobota");
                break;
            case 6:
                System.out.println("je neděle");
                break;    
        }
    }

}

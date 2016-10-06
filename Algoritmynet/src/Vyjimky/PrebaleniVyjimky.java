package Vyjimky;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrebaleniVyjimky {
    public static void main(String[] args) {
        int i = 0;
        boolean valid = false;
        do {
            System.out.println("zadej cislo v rozsahu int: ");
            try {
                i = readNumber();
                valid = true; //cislo je v poradku
            } catch (InvalidInputException ex) {
                System.out.println("Bylo zadáno neplatné číslo!");
            }
        } while (!valid);
        System.out.println("Bylo zadani cislo: "+i);
    }
    private static int readNumber() throws InvalidInputException {
        Scanner s = new Scanner(System.in);
        try {   
            return s.nextInt();
        } catch (InputMismatchException e) { //Runtime vyjimka, kterou scanner reaguje na neplatny vstup
            throw new InvalidInputException(e); //prebalime ji na checked exception            
        }        
    }
}
//Kontrolovana vyjimka vlastniho typu oznacujici, ze v nasem priklade doslo k chybe na vstupu
class InvalidInputException extends Exception {
    public InvalidInputException (Throwable cause) {
        super(cause);
    }
}
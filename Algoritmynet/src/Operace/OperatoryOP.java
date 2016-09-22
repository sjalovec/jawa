/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Operace;

/**
 * @author P3401971
 */
public class OperatoryOP {
    public static void main (String[] arg)
    {
        int a = 5;
        a = a + 3;
        System.out.println("Proměnná a = "+a); //vypíše 8
        
        int a2 = 5;
        System.out.println("Proměnná a2 = "+a2); //vypíše hodnotu a2
        
        a2 +=3; //alternativní zápis pro (a2 = a2 + 3)
        System.out.println("Proměnná a2 sčítání(5+3) = "+a2); //vypíše 8
        
        a2 /= 4; //alternativní zápis pro dělení (a2 = a2 / 4)
        System.out.println("Proměnná a2 dělení(8/4) = "+a2); //vypíše 2 (8 / 4)
        
        a2 -= 1; //alternativní zápis pro (a2 = a2 - 1)
        System.out.println("Proměnná a2 odčítání(2-1) = "+a2); //vypíše 1
        
        a2 *=3;
        System.out.println("Proměnná a2 násobená(1*3) = "+a2); //vypíše 3
    }
}

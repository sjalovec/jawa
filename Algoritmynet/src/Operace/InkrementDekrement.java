/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Operace;
/**
 * @author P3401971
 */
public class InkrementDekrement {
    public static void main(String[] args) 
    {
        //inkrementace = zvyšování
        //dekrementace = snižování
        int i = 1;
        i++; // i = 2 (i+1)
        ++i; // i = 3
        i--; //i = 2
        --i; // i = 1
        System.out.println("Aktuální hodnota i: "+i); 
        int c = i++ * 3; //c = 3, i = 2 (nejprve c = i * 3, pote i = i + 1)
        System.out.println("c = i++ * 3 => "+c);
        System.out.println("Aktuální hodnota i: "+i); //používáme i z minulého výpočtu
        int d = --i * 3; //d = 3, i = 1 (nejprve i = i - 1, pote d = i * 3)
        System.out.println("d = --i * 3 => "+d);
        
        i = 1;
        System.out.println("Aktuální hodnota i: "+i);
        int e = ++i * 3; //e = 6, i = 2 (nejprve i = i * 1, pote e = i * 3)
        System.out.println("e = ++i * 3 => "+e);
        
        i = 1;
        System.out.println("Aktuální hodnota i: "+i);
        int f = i-- * 3; //f = 3, i = 0 (nejprve f = i * 3, pot= i = i - 1)
        System.out.println("f = i-- * 3 => "+f);
        
        System.out.println("Aktuální hodnota i: "+i);   
    }

}

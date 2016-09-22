/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Promenne;

/**
 * @author P3401971
 */
public class PlatnostPromenne { //blok třídy
    public static void main (String[] arg) //blok daný metodou
    {
        int a = 5;
        System.out.println(a);
        { //vnitřní blok
            System.out.println("Nyní ve vnitřním bloku "+a); //proměnná a je stále platná i ve vnitřním bloku
            int b = 10;
            System.out.println(b); //vypise 10
        } //konec vnitřního bloku
        System.out.println(b); //toto hodí chybu, promenna je deklarovana ve vnitrnim bloku
    }

}

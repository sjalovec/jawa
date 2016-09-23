/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Objekty;

/**
 * @author P3401971
 */
public class TridaString {
    public static void main(String[] args) {
        String s = "Skákal pes přes oves"; //string = retezec
        s = s.substring(0, 6); //začínáš na 0 a pak prvních 6 znaků
        System.out.println(s); //do proměnné s máme uložených první 6 znaků přes substr
        
        String concat = s + " pes"; //concat není funkce, ale pouze pojmenování stringu. Pomocí + se spojují stringy
        System.out.println(concat); //vypíše obsah stringu concat
    }

}

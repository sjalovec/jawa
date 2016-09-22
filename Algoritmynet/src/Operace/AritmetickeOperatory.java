/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Operace;

/**
 * @author P3401971
 */
public class AritmetickeOperatory {
    public static void main (String[] arg)
    {
        int a = 1;
        int b = 1;
        
        double c = (a+b)/4;
        System.out.println(c); 
        /*vypíše 0, protože double, se stane proměnná po vydělení celých čísel a to je výsledek 0*/
        
        c = ((double)a+b)/4;
        System.out.println(c); 
        /*vypíše 0.5, protože double je definován před dělením 4*/
    }
}

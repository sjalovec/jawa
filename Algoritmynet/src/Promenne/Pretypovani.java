/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Promenne;

/**
 * @author P3401971
 */
public class Pretypovani {
    public static void main(String[] arg)
    {
        //byte -> short -> int -> long -> float -> double
        byte b = 5;
        int i = b; //automatická konverze, int má větší rozsah než byte
        System.out.println(i);
        
        long l = 150000L;
        i = (int) l; //hrozi přetečení, long je větší než int. O zmenu musime pozadat
        
        double d = 1.5;
        i = (int) d; //hrozi ztrata presnosti, o zmenu musime pozadat
        System.out.println(i); //vypíše proměnnou l
        
        d = i; //double má větší rozsah než integer
    }

}

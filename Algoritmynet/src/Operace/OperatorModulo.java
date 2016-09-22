/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Operace;

/**
 * @author P3401971
 */
public class OperatorModulo {
    public static void main(String[] args) 
    {
        //vyjádření celého čísla: a = b * k + c
        //operátor modulu (zbytek dělení celého čísla) se vyjadřuje % (dělení se zbytkem vyjádřený celým číslem)
        int munice = 50;
        int kapacitaZasobniku = 9;
        int zbytek = munice % kapacitaZasobniku;
        System.out.println(zbytek); //vypíše zbytek, 5
        //50 = 9 * 5 + 5
    }
}

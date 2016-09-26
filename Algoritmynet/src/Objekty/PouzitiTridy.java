/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Objekty;

/**
 * @author P3401971
 */
public class PouzitiTridy {
    public static void main(String[] args) {
        Animal alik = new Animal(); //deklarace s inicializaci tridy
        alik.druh = "pes";
        alik.zvuk = "HAF HAF";
        
        //další instance - Kocka
        Animal micina = new Animal(); //deklarace s inicializaci tridy
        micina.druh = "kocka";
        micina.zvuk = "MNAAUUU";
        
        System.out.println("Ja jsem "+alik.druh + "a delam "+alik.zvuk);
        System.out.println("ja jsem "+micina.druh + "a delam "+micina.zvuk);
    }

}

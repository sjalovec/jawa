/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metody;

/**
 * @author P3401971
 */
public class DeklaraceInstanceTridy {

    public static void main(String[] args) {
        DeklaraceInstanceTridy instance_tridy_pro_test = new DeklaraceInstanceTridy();
        instance_tridy_pro_test.typ = "String typ";
        instance_tridy_pro_test.typ2 = "String typ2";
        instance_tridy_pro_test.vyhodText();
    }

    public String typ;
    public String typ2;

    public void vyhodText() {
        System.out.println("Tohle je test typu: " + typ + "\na typu 2: " + typ2);
        System.out.println("Funguje?");
    }
}

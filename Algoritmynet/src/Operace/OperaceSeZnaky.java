/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Operace;

/**
 * @author P3401971
 */
public class OperaceSeZnaky {
    public static void main(String[] args) {
        char ch = 'A';
        ch++;
        System.out.println(ch); //B
        
        ch = (char)(ch + 2); //int + char je potřeba převézt do char
        System.out.println(ch); //D   
    }
}

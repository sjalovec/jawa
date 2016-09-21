/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Promenne;

/**
 * @author P3401971
 */
public class Promenne1 {
    public static void main (String[] arg)
    {
        
    /*
    deklarace a inicializace
    */
    int i1; //pouze deklarace
    i1 = 5000; //inicializace
    
    int i2 = 1500; //deklarace s inicializaci (doporučený postup)
    int i3, i4, i5; // deklarace více proměnných
    int i6 = 7, i7 = 15, i8 = 20; // toto není doporučeno podle algoritmy.net
    
    /*
    Celá čísla
    */
    byte b = 100; //datový typ byte
    
    short s = -30000; //short záporné číslo
    short s2 = 30000; //short kladné číslo
    
    int i = 10000;
    
    long l = 100;
    long l2 = 150000000000l; //long - prilis velke cislo
    long l3 = 150000000000L; //long - varianta L
    
    /*
    Reálná čísla
    */
    double d = 100.5;
    double d2 = 0.5;
    double d3 = .5; //0.5
    double d4 = 5E-1; //0.5
    double d5 = 0.5e0; //0.5
    
    float f = 100.5f;
    float f2 = 100.5F;
    
    /*
    Znaky
    */
    char ch = 'A';
    char ch2 = 65; //A podle ASCI tabulky
    //char ch3 = '\\u0041'; //tohle nějak na win10 nejde
    
    /*
    logické hodnoty
    */
    boolean bool = true;
    boolean bool2 = false;
    
    /*
    Příklad výpisu
    */
    System.out.println(b);
    System.out.println(i);
    System.out.println(l);
    System.out.println(d5);
    System.out.println(f2);
    //System.out.println(ch3);
    System.out.println(bool);
    }
}

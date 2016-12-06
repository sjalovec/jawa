package program;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println("Vyber, kterou chceš variantu:");
        System.out.println("1. Array list");
        System.out.println("2. Linked list");
        System.out.println("3. Ukončit");
        Scanner sc = new Scanner(System.in);
        int vyber = sc.nextInt();
        switch(vyber) {
            case(1):
                System.out.println("Vybrals 1");
                BufferedReader in = new BufferedReader(new FileReader("d:/soubor.txt"));
                List<String> mujArrayList = new ArrayList<String>();
                mujArrayList.add(in.readLine());
                System.out.println(mujArrayList);
                break;
            case(2):
                System.out.println("Vybrals 2");
                BufferedReader in2 = new BufferedReader(new FileReader("d:/soubor.txt"));
                List<String> mujLinkedList = new LinkedList<String>();
                mujLinkedList.add(in2.readLine());
                System.out.println(mujLinkedList);
                break;
            default:
                System.out.println("Vybrals na kokot.");
                break;
        };
    }
}

/*ja chci po tobe abys znovu naprogramoval spojovej seznam, bez divani se kamkoliv!!! a taky zaroven dynamicky alokovany pole a abych pak mohl spustit program nejak takto:
java -cp MyLinkedList < input.txt
input.txt bude txt soubor plnej cisel - na jednom radku, oddeleny mezerou
obdobne
java -cp MyArrayList < input.txt
to spousteni nebude obsahovat "-cp"
*/

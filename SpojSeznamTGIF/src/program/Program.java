package program;

import code.MujLinkedList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //FileReader fr = new FileReader("d:/soubor.txt");
        //System.out.println(fr);
        BufferedReader in = new BufferedReader(new FileReader("d:/soubor.txt"));
        List<String> mujLinkList = new ArrayList<String>();
        mujLinkList = in.readLine();
        //String line = in.readLine();
        System.out.println(mujLinkList);
        
        

    }

}

/*ja chci po tobe abys znovu naprogramoval spojovej seznam, bez divani se kamkoliv!!! a taky zaroven dynamicky alokovany pole a abych pak mohl spustit program nejak takto:
java -cp MyLinkedList < input.txt
input.txt bude txt soubor plnej cisel - na jednom radku, oddeleny mezerou
obdobne
java -cp MyArrayList < input.txt
to spousteni nebude obsahovat "-cp"
*/

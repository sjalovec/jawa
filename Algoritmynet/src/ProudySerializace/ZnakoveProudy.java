package ProudySerializace;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;

public class ZnakoveProudy {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        //dva parametry prikazove radky -> 1) cesta k souboru 2) kodovani souboru
        if (args.length != 2) {
            System.out.println("Usage: program file_name file_encoding");
            System.exit(1); //ukončí běh programu s kodem 1. Kod != 0 znamená chybu
        }
        String filePath = args[0];
        String fileEncoding = args[1];

        //args[0] = "d:/student.txt"; //tohle jsem si pridal ja
        //args[1] = "UTF-8"; //tohle jsem si pridal ja

        int wordCount = 0;
        int lineCount = 0;
        int characterCount = 0;

        //vytvoreni nove bufferovatelné ctecky s danym kodovanim z FileInputStreamu
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), fileEncoding));
        String line = null;
        while ((line = reader.readLine()) != null) { //dokud mame k dispozici dalsi radek
            characterCount += line.length();
            lineCount++;

            //tokenizer rozlozi text na jednolive symboly (tokeny) dle uvedenych oddelovacu (delimiter)
            StringTokenizer mujTokenizer = new StringTokenizer(line, " \\u0009"); //oddelovace jsou mezera a \\u0009 == tabulator
            wordCount += mujTokenizer.countTokens();
        }
        reader.close(); //Readery (a Writery) musime zavrit

        System.out.println("Počet znaků: " + characterCount);
        System.out.println("Počet slov: " + wordCount);
        System.out.println("Počet řádků: " + lineCount);
    }

}

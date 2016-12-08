package MyLinkedListPckg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedReader BR = new BufferedReader(new FileReader("d:/soubor.txt"));
        List<String> mujLinkedList = new LinkedList<String>();
        mujLinkedList.add(BR.readLine());
        System.out.println(mujLinkedList);
    }
}

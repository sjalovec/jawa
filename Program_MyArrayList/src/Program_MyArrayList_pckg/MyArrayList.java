package Program_MyArrayList_pckg;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

    public static void main(String[] args) throws IOException {
        //MyLinkedList.myLinkedListMethod();
        MyArrayListSubClass.myArrayListMethod();
    }

    static class MyLinkedList {

        public static void myLinkedListMethod() throws FileNotFoundException, IOException {
            BufferedReader BR = new BufferedReader(new FileReader("d:/soubor.txt"));
            List<String> mujLinkedList = new LinkedList<String>();
            mujLinkedList.add(BR.readLine());
            System.out.println(mujLinkedList);
        }
    }

    static class MyArrayListSubClass {

        public static void myArrayListMethod() throws FileNotFoundException, IOException {
            BufferedReader BR2 = new BufferedReader(new FileReader("d:/soubor.txt"));
            List<String> mujArrayList = new ArrayList<String>();
            mujArrayList.add(BR2.readLine());
            System.out.println(mujArrayList);
        }
    }
}


//C:\Users\P3401971\My Documents\NetBeansProjects\MyArrayListSubClass\dist>java -jar MyArrayListSubClass.jar
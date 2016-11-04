package Vlakna;

import java.util.ArrayList;
import java.util.List;

public class JednoVlakovaApp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        printList(list);
    }
    
    public static void printList(List l) {
        for (Object o : l) {
            System.out.println(o);
        }
    }

}

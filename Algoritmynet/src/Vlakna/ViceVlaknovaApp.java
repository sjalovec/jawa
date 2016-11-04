package Vlakna;

import java.util.ArrayList;
import java.util.List;

public class ViceVlaknovaApp {

    public static void main(String[] args) {
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        printList(list);
    }

    public static void printList(List l) {
        for (Object o : l) {
            System.out.println(o);
        }
    }
}

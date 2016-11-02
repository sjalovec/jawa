package Kolekce;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PouzitiDequeAQueue {

    public static void main(String[] args) {
        //použití linked list v deque
        Deque<Integer> mujDeqLinkList = new LinkedList<Integer>(); //spojovy seznam je obousmerny, jede se odzadu
        mujDeqLinkList.add(1);
        mujDeqLinkList.add(2);
        mujDeqLinkList.add(3);
        System.out.println("Použití deque s využitím LinkedList");
        System.out.print(mujDeqLinkList.pollLast() + " "); //3
        System.out.print(mujDeqLinkList.pollLast() + " "); //2
        System.out.print(mujDeqLinkList.pollLast() + " "); //1
        System.out.println(mujDeqLinkList.isEmpty()); //true
        //použití queue
        Queue<Integer> mujQueLinkList = new LinkedList<Integer>(); //spojovy seznam implementuje take frontu, jede se od prvního
        mujQueLinkList.add(1);
        mujQueLinkList.add(2);
        mujQueLinkList.add(3);
        System.out.println("Použití queue s využitím LinkedList");
        System.out.print(mujQueLinkList.poll() + " "); //1
        System.out.print(mujQueLinkList.poll() + " "); //2
        System.out.print(mujQueLinkList.poll() + " "); //3
        System.out.println(mujQueLinkList.isEmpty()); //true
        //použití prioritní fronty
        Queue<Integer> prioFronta = new PriorityQueue<Integer>();
        prioFronta.add(1);
        prioFronta.add(4);
        prioFronta.add(3);
        prioFronta.add(2);
        //za vyssi prioritu je povazovana nizsi hodnota cisla
        //razeni prioritni frontou (binarni haldou) se nazyva heapsort a ma asymptotickou
        System.out.println("Použití prioritní fronty");
        System.out.print(prioFronta.poll()+" "); //1
        System.out.print(prioFronta.poll()+" "); //2
        System.out.print(prioFronta.poll()+" "); //3
        System.out.print(prioFronta.poll()+" "); //4
    }

}

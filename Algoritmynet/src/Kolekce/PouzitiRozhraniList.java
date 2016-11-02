package Kolekce;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class PouzitiRozhraniList {

    public static void main(String[] args) {
        //použití arraylist
        List<String> mujArrayList = new ArrayList<String>();
        mujArrayList.add("jedna");
        mujArrayList.add("dva");
        System.out.println("Použití arraylist");
        System.out.print(mujArrayList.get(0)); //jedna
        System.out.print(mujArrayList.get(1)); //dva
        
        //pouzití LinkedList
        List<String> mujLinkedList = new LinkedList<String>();
        mujLinkedList.add("jednicka");
        mujLinkedList.add("dvojka");
        System.out.println("\nPoužití linkedlist"); 
        System.out.print(mujLinkedList.get(0)); //jednicka
        System.out.print(mujLinkedList.get(1)); //dvojka
        
        //použití vector (obdoba dynamickeho pole)
        List<String> mujVector = new Vector<String>();
        mujLinkedList.add("1");
        mujLinkedList.add("2");
        System.out.println("\nPoužití vector"); 
        System.out.print(mujLinkedList.get(0)); //1
        System.out.print(mujLinkedList.get(1)); //2               
    }
}

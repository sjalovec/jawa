package Kolekce;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PouzitiRozhraniSet {

    public static void main(String[] args) {
        //pouziti hashset
        Set<Integer> mujHashSet = new HashSet<Integer>();
        mujHashSet.add(1);
        mujHashSet.add(37);
        mujHashSet.add(1);
        mujHashSet.add(17);
        System.out.println("Pužití HashSet");
        for (Integer i : mujHashSet) {
            System.out.print(i + " "); //17 1 37 (zadna duplicita, poradi negarantovano)
        }
        //pouziti treeset        
        Set<Integer> mujTreeSet = new TreeSet<Integer>();
        mujTreeSet.add(37);
        mujTreeSet.add(17);
        mujTreeSet.add(37);
        mujTreeSet.add(1);
        System.out.println("\nPoužití Treeset");    
        for (Integer i : mujTreeSet) {
            System.out.print(i + " ");
        }
    }

}

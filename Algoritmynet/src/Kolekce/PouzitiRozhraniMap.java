package Kolekce;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PouzitiRozhraniMap {

    public static void main(String[] args) {
        //vyuziti hashmap
        Map<Integer, String> mujHashMap = new HashMap<Integer, String>();
        mujHashMap.put(2, "dva ");
        mujHashMap.put(1, "jedna ");
        System.out.println("Použití HashMap");
        System.out.print(mujHashMap.get(1)); //jedna
        System.out.print(mujHashMap.get(2)); //jedna

        //použití treemap
        Map<Integer, String> mujTreeMap = new TreeMap<Integer, String>();
        mujTreeMap.put(2, "dva ");
        mujTreeMap.put(3, "tři ");
        mujTreeMap.put(1, "jedna ");
        System.out.println("\nPoužití treemap");
        for (Integer key : mujTreeMap.keySet()) {
            System.out.print(mujTreeMap.get(key)); //jedna dva tri, seřazené podle klíce
        }
    }

}

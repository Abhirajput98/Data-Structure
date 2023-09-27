package LEC_62;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_Demo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // randomely add hota hai set mai
        set.add(2332);
        set.add(432);
        System.out.println(set.remove(432));
        System.out.println(set);
        System.out.println(set.size());
        // Tree set
        // value wise sorted rhtea hai data
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(45);
        set1.add (3434);
        set1.add(55);
        System.out.println(set1);
        //Set<String> key = new map.keySet();



    }
}

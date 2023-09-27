package LEC_62;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class hashmap_demo {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        // How to add in the hash map <<< map.put
        // key  jo hogga wh unique hoga
        //agar duplicate value ayegi toh purani wali ko update kr dega
        map.put("RAci",79);
        map.put("abhi",95);
        map.put("ruchi",92);
        map.put("sachit",79);
        map.put("rohit ",74);
        map.put("Rvi",77);
        map.put("mukdsh",53);
        System.out.println(map);
        //get
        System.out.println(map.get("Rvi"));
        // removes
        System.out.println(map.remove("Rvi")); // return krta hai remove function
        // contains
        System.out.println(map.containsKey("ruchi"));
        // implementation linked list ke through hoti hai
        LinkedHashMap<String,Integer> map2= new LinkedHashMap<>();
        // jis order main data dalenge usi order may data dalega
        //null as a key store ho jayega
        // implementation by doubly linked list hota hai
        map2.put("RAci",79);
        map2.put("abhi",95);
        map2.put("ruchi",92);
        map2.put("sachit",79);
        map2.put("rohit ",74);
        map2.put("Rvi",77);
        map2.put("mukdsh",53);
        System.out.println(map2);





    }
}

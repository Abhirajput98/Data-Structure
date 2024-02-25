package LEC_2.LEC_19;

import java.util.ArrayList;

public class Arrays_List {
    public static void main(String[] args) {
        ArrayList<Integer> list;  /// list name valiable craeted in which int type data stroe;
        ArrayList<Integer> list2=new ArrayList<>(); // In heap
        System.out.println(list2.size());
        System.out.println(list2);
        list2.add(10); // last mein add hoty jayenge
        list2.add(22);
        list2.add(34);
        System.out.println(list2);
        list2.add(1,50); // put value by index;  ---- Index ka range 0 to size (included);
        System.out.println(list2);
        // remove;
        System.out.println(list2.remove(3));  // remove elements by index;
        System.out.println(list2);
        //get
        System.out.println(list2.get(2));  //  gets data at given index;
        // change index value;
        list2.add(3,-122);  // value ko update krega ; index pr
        System.out.println(list2);





    }
}

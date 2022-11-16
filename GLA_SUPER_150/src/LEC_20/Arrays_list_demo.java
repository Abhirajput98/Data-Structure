package LEC_20;

import java.util.ArrayList;

public class Arrays_list_demo {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();   /// system ke ander empty set create
        //  By default Size =0  capacity 10;
        list.add(2,-12); // ese nhi rkh skty rkhenge toh 0 index pr rkhenge;
        // continuous data fil hogaa.. kisi bhi index ko  skip nhi krenge;
        // Array lis grow by --... (old size + old size/2 +1)
        //
         /* CAN WE CHANGE DEFAULT CAPACITY OF ARRAYS LIST??
         YES,
         ArrayList<Integer>list=new ArrayList<>(190);





          */



    }
}

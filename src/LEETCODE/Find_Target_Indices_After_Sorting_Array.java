package LEETCODE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Target_Indices_After_Sorting_Array {
    public static void main(String[] args) {
        int [] arr =  {1,2,5,2,3};
        int target = 8;
        Arrays.sort(arr);
        List<Integer> l = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                l.add(i);

            }
        }
        System.out.println(l);

    }
}

package LEETCODE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class find_missing_number {
    public static void main(String[] args) {
        int [] arr = {1,2,2,4,};
       // System.out.println(duplicate(arr));
//        System.out.println(missing(arr));
        int [] newar = new int[2];
        newar [0]=duplicate(arr);
        newar[1]=missing(arr);
        System.out.println(Arrays.toString(newar));
    }
    public static int duplicate(int [] arr){
        for(int i =0;i<arr.length-1;i++){
            int j=i+1;
            if(arr[i]==arr[j]){
                return arr[i];
            }
        }
        return -1;
       //
    }
    public static int missing(int [] arr){
        Arrays.sort(arr);
        int si =arr[0];
        List<Integer> l = new ArrayList<>();
        int m= arr[arr.length-1];
        for(int i =0;i<arr.length;i++){
            l.add(arr[i]);

        }
        for (int i =si;i<m;i++) {
            //System.out.println(l.get(i));
            if(!l.contains(i)){
                //System.out.println(i);
                return i;
            }

        }
        return -1;
    }
}

package LEETCODE;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Rank_Transform_of_an_Array {
    public static void main(String[] args) {
        int  [] arr = {100,100,100};
        int [] arr1 = new int [arr.length];
        for(int i =0;i<arr.length;i++){
            arr1[i]=arr[i];
        }
        Arrays.sort(arr1);
        for(int i =0;i<arr.length-1;i++){
            int n = findrank(arr1,arr[i]);

            arr[i]=n+1;
           // System.out.println(n);
        }
        System.out.println(Arrays.toString(arr));


    }
    public  static int findrank(int []arr1,int n ){
        for(int i =0;i<arr1.length;i++){
            if(arr1[i]==n){
                return i;
            }
        }
        return -1;

    }

}

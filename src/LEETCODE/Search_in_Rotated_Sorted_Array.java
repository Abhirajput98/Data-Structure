package LEETCODE;

import java.util.Arrays;

public class Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int [] arr = {0,1,2,4,5,6,7};

      //  System.out.println(Arrays.toString(arr));
      //  System.out.println(Arrays.toString(rotate(arr,3)));
        System.out.println(rotate(arr,3));
    }
    public static int rotate(int [] arr, int n ){
        for(int i =0;i<arr.length;i++) {
            if (arr[i] != n) {
                return -1;
            }
        }
        if(n==0){
            return arr[0];
        }

//        for(int i =0;i<arr.length;)
        int temp = arr[0];
        for(int i =0;i<arr.length-1;i++){

            arr[i]=arr[i+1];

        }
        arr[arr.length-1]=temp;
        return rotate(arr,n-1);

    }

    }

package LEETCODE;

import java.util.Arrays;

public class length_of_lastword {
    public static void main(String[] args) {
        String s ="Hello World";
        String [] arr=s.split(" ");
        //System.out.println(Arrays.toString(arr));
        int n  = arr.length-1;
        String a = arr[n];
        System.out.println(a.length());





    }
}

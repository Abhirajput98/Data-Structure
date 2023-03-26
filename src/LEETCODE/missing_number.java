package LEETCODE;

import java.util.Arrays;

public class missing_number {
    public static void main(String[] args) {
       int[] n = {0,1};
        Arrays.sort(n);
        for(int i =n[0];i<n[n.length-1];i++){
            if(i!=n[i]){
                System.out.println(i);
            }
        }
        System.out.println(n.length);
    }
}

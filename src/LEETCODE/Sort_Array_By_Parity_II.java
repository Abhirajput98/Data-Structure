package LEETCODE;

import java.util.Arrays;

public class Sort_Array_By_Parity_II {
    public static void main(String[] args) {
        int [] arr = {2,3};
        int j =0;

        int [] ans = new int [arr.length];
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]%2==0){
                ans[j]=arr[i];
                j+=2;
            }
        }
        j=1;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]%2!=0){
                ans[j]=arr[i];
                j+=2;
            }
        }
      System.out.println(Arrays.toString(ans));
    }
}

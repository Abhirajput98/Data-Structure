package Geeks_for_Geeks;

import java.util.ArrayList;
import java.util.List;

public class First_Repeating_Element {
    public static void main(String[] args) {
         int []arr = {1, 5, 3, 4, 3, 5, 6};
         int [] ans = new int [10001];
         for(int i =0;i<arr.length;i++){
             ans[arr[i]]++;
         }
         for(int i =0;i< arr.length;i++){
             if(ans[arr[i]]==2){
                 System.out.println( i);
             }

         }
        System.out.println(ans);


    }
}

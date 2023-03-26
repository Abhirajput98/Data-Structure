package LEETCODE;

import java.util.Arrays;

public class third_maximum {
    public static void main(String[] args) {
       int [] arr = {2,0};
//        System.out.print(maximum(arr));
       Arrays.sort(arr);
       int c =0;
       int k =0;
       if(arr.length<3){
           System.out.println(arr[arr.length-1]);
       }
       for(int i= arr.length-1;i>=0;i--){
           if(k!=arr[i]){
               k=arr[i];
               c++;
               if(c==3){
                   System.out.println(arr[i]);
               }

           }

       }





    }

}

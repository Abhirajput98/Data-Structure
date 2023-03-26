package LEETCODE;

import java.util.Arrays;

public class Prime_Subtraction_Operation {
    public static void main(String[] args) {
        int [] nums= {5,8,3};
       // System.out.println(checksorted(nums));
      //  System.out.println( lastprime(9));
      System.out.println(ans(nums));
      /*  int n =nums[0];
        int k =lastprime(n);
        System.out.println(lastprime(k));*/


    }
    public static boolean ans(int [] arr){
        int i =0;
        for(int l =0;l<10;l++){
            if(checksorted(arr)){
               return true;
           }
            else if(arr[0]>arr[arr.length-1]){
                return false;
            }
           else if( i<arr.length){

               int n =arr[i];
               int k =lastprime(n);
               arr[i]=arr[i]-k;
               i++;

           }

       }

       return false;
    }

    public static boolean checksorted(int [] arr){
        for(int i =0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                return false;
            }

        }
        return true;
    }
    public  static int lastprime( int i ){
        for(int j =i;j>0;j--) {
            int c = 0;
            for (int k = 1; k < j; k++) {
                if (j % k == 0) {
                    c++;
                   // System.out.println(c);
                }
            }
            if(c==1){
                return j;
            }
        }
        return -1;

    }
}


package LEETCODE;
import  java.util.Collections;

import java.util.Arrays;


public class max_profit {
    public static void main(String[] args) {
        int []prices = {7,1,5,3,6,4};
        int mi=prices[0];
        int j=0;
       for(int i =0;i<prices.length;i++) {
           if (prices[i] < mi) {
               mi = prices[i];
               j = i;
           }

       }
       int ans=0;
       for(int k=j;k<prices.length-1;k++){
           if(prices[k]>prices[k+1]){
               ans=prices[k];

           }
       }
        System.out.println(ans-mi);



    }
}

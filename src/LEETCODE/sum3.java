package LEETCODE;

import java.awt.*;
import java.util.*;
import java.util.List;

public class sum3 {
    public static void main(String[] args) {
       int [] nums = {-1,0,1,2,-1,-4};
     //  int [] arr =new int[3];
        List<Integer> l1 = new ArrayList<>();
       int [][] arr = new int[2][3];
       for(int i =0;i<nums.length;i++){
           for(int j=0 ;j<nums.length;j++){
               for(int k =0;k<nums.length;k++){
                   if((nums[i]+nums[j]+nums[k]==0) && i!=j && i!=k && j!=k) {
                       /*System.out.print(nums[i]+" ");
                       System.out.print(nums[j]+ " ");
                       System.out.print(nums[k]+" ");*/
                       if(!l1.contains(nums[i])|| !l1.contains(nums[j]) || !l1.contains(nums[k])){
                           l1.add(nums[i]);
                           l1.add(nums[j]);
                           l1.add(nums[k] );

                           System.out.print("["+ l1.get(i)+" " + l1.get(j)+" "+ l1.get(k)+"]");

                       }


                   }


               }
           }

       }


    }
}

package LEETCODE;

import java.util.Arrays;

public class Rearrange_Array_Elements_by_Sign {
    public static void main(String[] args) {
       int [] nums = {-1,1};
       int [] ans = new int[nums.length];
       int k=0;
       int j=1;
       for(int i =0;i<nums.length;i++){
           if(nums[i]>0){
               ans[k]=nums[i];
               k+=2;
           }
           else {
               ans[j]=nums[i];
               j+=2;

           }
       }
        System.out.println(Arrays.toString(ans));
    }
}

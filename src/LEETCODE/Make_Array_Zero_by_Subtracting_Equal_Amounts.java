package LEETCODE;

import java.util.Arrays;

public class Make_Array_Zero_by_Subtracting_Equal_Amounts {
    public static void main(String[] args) {
       int [] nums = {1,5,0,3,5};
        Arrays.sort(nums);
        int c=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                int a = nums[i];
                c++;
                for(int j =i;j< nums.length;j++){
                    nums[j]=nums[j]-a;
                }
            }
        }
        System.out.println(c);


    }
}

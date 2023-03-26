package LEETCODE;

import java.util.Arrays;

public class move_all_zero_to_end {
    public static void main(String[] args) {
        int [] nums={0,0,1,2};
        for(int i =0;i<nums.length;i++){
            if(nums[0]==0){
                //int temp = nums[n.length-1];
                for(int j =i;j<nums.length-1;j++){
                   // int temp = nums[j];
                    nums[j]=nums[j+1];
                }


            }
            nums[nums.length-1]=0;

        }
        System.out.println(Arrays.toString(nums));



    }
}

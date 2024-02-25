package LEETCODE;

import java.util.Arrays;

public class Divide_Array_Into_Arrays_With_Max_Difference {
    public static void main(String[] args) {

        int[] nums= {15,13,12,13,12,14,12,2,3,13,12,14,14,13,5,12,12,2,13,2,2};
        int k = 2;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int[][] ans = new int[nums.length / 3][3];
        //System.out.println(Arrays.toString(ans));
        int l = 0;
        int [][] s = {};
        //System.out.println();


        for (int i = 0; i < ans.length; i++) {

            for (int j = 0; j < ans[0].length; j++) {
                ans[i][j] = nums[l];
                l++;
            }
        }

        for (int i = 0; i < ans.length; i++) {
            if(ispossible(ans[i],k)==false){
                System.out.println("no");

            }

        }
        System.out.println("yes"
        );
    }public  static  boolean ispossible(int []arr,int k){
        if(Math.abs(arr[0]-arr[1])<=k&&Math.abs(arr[1]-arr[2])<=k && Math.abs(arr[0]-arr[2])<=k){
            return true;

        }
        return false;
}


}

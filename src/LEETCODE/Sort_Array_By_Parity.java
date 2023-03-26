package LEETCODE;

import java.util.Arrays;

public class Sort_Array_By_Parity {
    public static void main(String[] args) {
        int[] nums = {0};
        int[] arr = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arr[j] = nums[i];
                j++;

            }
        }
      //  System.out.println(j);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                arr[j] = nums[i];
                j++;


            }
          //  System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}

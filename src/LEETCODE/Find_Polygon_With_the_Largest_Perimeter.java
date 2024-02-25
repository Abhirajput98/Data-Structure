package LEETCODE;

import org.xml.sax.ext.DeclHandler;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Find_Polygon_With_the_Largest_Perimeter {
    public static void main(String[] args) {
        int [] nums = {1,12,1,2,5,50,3};
        Arrays.sort(nums);
        // 1,1,2,3,5,12,50
        System.out.println(Arrays.toString(nums));
      //  System.out.println(largestPerimeter(nums));

        int sum=0;
        for(int i :nums){
            sum += i;
        }
        for(int i = nums.length -1 ; i >=0  ;i++){
            if(sum-nums[i] > nums[i] ){
                System.out.println(sum);
            } else {
                sum -= nums[i];
            }
        }
        System.out.println( -1);


    }

}

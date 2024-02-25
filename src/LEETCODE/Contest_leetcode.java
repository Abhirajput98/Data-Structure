package LEETCODE;

public class Contest_leetcode {
    public static void main(String[] args) {
        int []arr={1,2,-3};
        System.out.println(returnToBoundaryCount(arr));

    }
    public static int returnToBoundaryCount(int[] nums) {
        int boundary=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                boundary+=nums[i];
            }
            else if(0>nums[i]){
                boundary=boundary+nums[i];
            }
        }
        System.out.println(boundary);
        if(boundary>=0){
            return 1;
        }
        return 0;

    }
}

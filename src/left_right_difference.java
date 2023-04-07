import java.util.Arrays;

public class left_right_difference {
    public static void main(String[] args) {
        int []nums = {10,4,8,3};
        int [] right = new int[nums.length];
        right[0]=0;
        //int k=0;
        for(int i =0 ;i<nums.length-1;i++){
            right[i+1]=nums[i]+right[i];
        }
        int [] left = new int [nums.length];
        left [left.length-1]=0;
       // int j =0;
        for(int i = left.length-2;i>= 0;i--){
            left[i] = nums[i+1]+left[i+1];
            //System.out.println(left[i]);

        }
        int [] ans = new int [left.length];
        for(int i =0;i< ans.length;i++){
            ans[i]=Math.abs(right[i]- left[i]);

        }
        System.out.println(Arrays.toString(ans));

    }
}

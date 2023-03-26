package LEETCODE;

public class minimum_steps {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};
        int max = nums[0];
        steps(nums,max);

    }
    public static void steps(int [] arr,int m){
        int c=1;
        int ans=0;
        int stp=0;
        for(int i =1;i<m;i++){
            if (i + arr[i + 1] == arr.length) {
                ans = c + 1;
                // ans;
                break;
            }

        }
        System.out.println(ans);

    }
}

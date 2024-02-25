package Lec_40;

import java.util.Stack;

public class Maximum_score_of_Good_Subarray {
    public static void main(String[] args) {
       int [] nums = {1,4,3,7,4,5};
       int k = 3;
        System.out.println(maximumScore(nums,k));


    }
    public  static  int maximumScore(int[] nums, int k) {
        int[] arr = new int[nums.length + 1];
        for(int i = 0; i < nums.length; ++i){
            arr[i] = nums[i];
        }
        return largestRectangleArea(arr, k);
    }
    public static int largestRectangleArea(int[] arr, int k){
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(int i = 0; i < arr.length; ++i){
            while(!st.isEmpty() && arr[i] < arr[st.peek()]){
                int h = arr[st.pop()];
                int r = i; // r jo hai woh r-1 tak count hoga;
                if(r - 1 >= k){ // initial jo condition hai i<=k<=j hai usko satisfy krne ke liye
                    if(st.isEmpty()){
                        int a = h * r;
                        ans = Math.max(ans, a);
                    }
                    else{
                        int l = st.peek(); // l jo hia woh l+1 se include hoga
                        if(l + 1 <= k){ // initial jo condition hai i<=k<=j hai usko satisfy krne ke liye
                            int a = h * (r - l - 1);
                            ans = Math.max(ans, a);
                        }
                    }
                }
            }
            st.push(i);
        }
        return ans;
    }
        }

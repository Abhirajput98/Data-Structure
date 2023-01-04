package LEC_22;

public class numSubarrayProductLessThanK {
    public static void main(String[] args) {
        int [] nums = {10,5,2,6};
        int k=100;
        // it is a variable size window;
        System.out.println(CountSubArray(nums,k));

    }
    public  static int CountSubArray(int [] arr,int k){
        int ans=0;
        int si=0;
        int ei=0;
        int p=1;
        while(ei<arr.length){
            // grow;
            p*=arr[ei];
            // shrink
            while(p>=k){
                p/=arr[si];
                si++;
            }
            // ans calculate;
            ans= ans+(ei-si+1);
            ei++;
        }
        return ans;

    }
}

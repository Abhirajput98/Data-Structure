package LEC_12;

public class kadanes_Algo {
    public static void main(String[] args) {
        int []  arr= {-2,-5,-6,-5,-7};
        System.out.println(maxsum(arr));


    }
    public static int maxsum(int[] arr){
        int ans = Integer.MIN_VALUE;
        int sum=0;
        for (int i = 0 ; i< arr.length;i++){
            sum+=arr[i];
            ans= Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }

        }
        return ans;
    }
}

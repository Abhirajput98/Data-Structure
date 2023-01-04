package LEC_1;

public class window_size {
    public static void main(String[] args) {
        int [] arr ={2,1,3,5,1,2,1,7,8,2,4};
        int k = 3;
        System.out.println(Maxsum(arr,k));

    }
    public  static int Maxsum(int [] arr , int k){
        int sum=0;
        int max=0;
        for(int i =0;i<k;i++){
            sum+=arr[i];
        }
        max=sum;
        for(int i =k;i< arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            max=Math.max(sum,max);
        }
        return max;

    }
}

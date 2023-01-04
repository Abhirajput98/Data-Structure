package LEC_22;

import java.util.Scanner;

public class Sliding_Window_Technique {
    public static void main(String[] args) {
        /*
                   SLIDING WINDOW--
        array or string and a value k will be given;
        output---- sub array or sub string  and contition is given or  max min vilue we givnen;

        Two types of sliding window--
           1) Variable Size
           2) Fixed Size   << subarray size is fixed
                 -- 1] Fist window find
                 --2] add one element and shrink from first;



                 grow
                 shrink
                 ans
                 ei++

           * */

        Scanner sc = new Scanner(System.in);
        int [] arr ={2,1,3,5,1,2,1,7,8,2,4};
        int k= sc.nextInt();
        System.out.println(Maximum_Sum(arr,k));


    }
    public  static int Maximum_Sum(int [] arr,int k){
        int max=0;
        int sum=0;
        for(int i =0;i<k;i++){
            sum=sum+arr[i];
        }
        max=sum;
        for(int i =k;i<arr.length;i++){
            sum=sum+arr[i];  //  window size increase hua h
            sum=sum-arr[i-k]; //  window size km hua h;
            max=Math.max(max,sum);
        }
        return max;
    }
}

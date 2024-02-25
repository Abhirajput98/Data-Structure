package Lec_40;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class Daily_Temperature {
    public static void main(String[] args) {
        int []temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(next_Greater(temperatures)));
    }
    public static int[] next_Greater(int [] arr ){
        //int [] ans = new int [arr.length];
        Stack<Integer> s = new Stack<>();
        int ans [] = new int [arr.length];
        for(int i =0;i<arr.length;i++){
            while(!s.isEmpty() && arr[i]>arr[s.peek()]){  // arr[i]>arr[s.peek()] is liye kia  hai kyuki stack kr upr indec hai na ki value;


                int a =  s.pop();
                ans[a]= i-a;
            }
            s.push(i);

        }
        while(!s.isEmpty()){ // Stack mein ab woh index rehgye hobge jinka abhi koi next grestrer nhi bns hogs
            //isliye unko -1 krdwbge

            int ii = s.pop();
            ans[ii]=0;
        }
        return ans;
//        for(int i=0;i< arr.length;i++){
//            System.out.println(arr[i]+" "+ ans[i]);
//            // System.out.println();
//        }
    }

}

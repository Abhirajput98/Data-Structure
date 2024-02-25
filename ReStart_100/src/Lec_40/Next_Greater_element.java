package Lec_40;

import java.util.Arrays;
import java.util.Stack;

public class Next_Greater_element {
    public static void main(String[] args) {
        int [] arr={11,2,3,23,9,15};
        next_Greater(arr);


    }
    public static void next_Greater(int [] arr ){
        Stack<Integer> s = new Stack<>();
        int ans [] = new int [arr.length];
        for(int i =0;i<arr.length;i++){
            while(!s.isEmpty() && arr[i]>arr[s.peek()]){  // arr[i]>arr[s.peek()] is liye kia  hai kyuki stackn kr upr indec hai na ki value;

                    int a =  s.pop();
                    ans[a]= arr[i];
                }
            s.push(i);

        }
        while(!s.isEmpty()){ // Stack mein ab woh index rehgye hobge jinka abhi koi next grestrer nhi bns hogs
            //isliye unko -1 krdwbge

            int ii = s.pop();
            ans[ii]=-1;
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]+" "+ ans[i]);
           // System.out.println();
        }
    }

}

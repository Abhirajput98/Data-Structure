package LEETCODE;

import java.util.Arrays;

public class Relative_rank {
    public static void main(String[] args) {
        int[] score = {10, 3, 8, 9, 4};
        int[] arr = new int[score.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = score[i];
        }
        Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
        String [] ans = new String[arr.length];
        for(int i =0;i< ans.length;i++){
            if(i== arr.length-1){
                ans[i]="Gold";

            }
            else if(i==arr.length-2){
                ans[i]="Silver";
            }
            else if(i==arr.length-3){
                ans[i]="Bronze";
            }
            else {
                ans[i]=Integer.toString(arr.length-i);
            }
        }
        String [] an1 = new String[arr.length];
        //System.out.println(Arrays.toString(ans));
        for(int i =0;i< arr.length;i++){
            for(int j =0;j< score.length;j++){
                if(score[i]==arr[j]){
                    an1[i]=ans[j];

                }
            }
        }
        System.out.println(Arrays.toString(an1));


    }


}


package LEETCODE;

import java.util.Arrays;
import java.util.HashMap;

public class Find_the_Town_Judge {
    public static void main(String[] args) {
        int n = 2;
        int [][]trust = {{1,3},{2,3}};
        System.out.println(JudgeOfTheTown(trust,3));

    }
    public static int JudgeOfTheTown(int [][] arr,int n){
        int [] ans = new int[n];
        for(int i =0;i< arr.length;i++){
            for(int j=0;j< arr[0].length;j++){
                ans[arr[i][0]-1]=1;
            }
        }
        for(int i =0;i<ans.length;i++){
            if(ans[i]==0){
                return i+1;
            }
        }
        //System.out.println(Arrays.toString(ans));
        return -1;
    }
}

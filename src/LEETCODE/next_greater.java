package LEETCODE;

import java.sql.Array;
import java.util.Arrays;

public class next_greater {
    public static void main(String[] args) {
        int []nums1 = {4,1,2};
        int []nums2 = {1,3,4,2};
        int[] new1 = new int[nums1.length];
        int ans=0;
        for(int i =0;i<nums1.length;i++){
            for (int j =0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                     ans= j;
                }
            }
            //System.out.println((isthere(nums2,ans)));
            if(nums1[i]<isthere(nums2,ans)){


            }
            else {
                new1[i]=-1;

            }
          /*//  if(isthere(nums2,ans) >nums1[ans]){


            }
            else {
                new1[i]=-1;
            }*/

        }
        System.out.println(Arrays.toString(new1));

       // System.out.println(isthere(nums2,1));

    }
    public static  int  isthere(int []arr,int n){
        int ans=0;
        for(int i =n+1;i<arr.length;i++){
            if(arr[i]>arr[n]){
                ans=arr[i];

            }
        }
        if(ans>arr[n]){
            return ans;

        }
        return arr[n];


    }
}

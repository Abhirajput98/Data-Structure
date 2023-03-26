package LEETCODE;

import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element {
    public static void main(String[] args) {
        int []nums = {5,7,7,8,8,10,4,8};
        int [] newarr = new int[2];
        System.out.println(find(nums,6));
        System.out.println(last(nums,8));
    }
    public static int find(int [] arr , int target){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;


    }
    public static int last(int [] arr , int target){
        for(int i =arr.length-1;i>=0;i--){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;


    }
}

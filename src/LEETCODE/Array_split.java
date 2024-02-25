package LEETCODE;

import java.util.Arrays;
import java.util.HashMap;

public class Array_split {
    public static void main(String[] args) {
        int [] nums ={6,1,3,1,1,8,9,2};
        System.out.println(split(nums));
        //System.out.println(hasmp(nums));
    }
    public static boolean split(int[] nums){
        Arrays.sort(nums);
        int []a = new int [nums.length/2];
        int[] b = new int [nums.length/2];
        int s =0;
        int f = 0;
        for(int i =0;i<nums.length;i++){
            if(i%2==0){
                a[s]=nums[i];
                s++;
            }
            else {
                b[f]=nums[i];
                f++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
//        if(check(a) && check(b)){
//            return true;
//        }
//        return false;
        if(hasmp(a)&&hasmp(b)){
            return true;
        }
        return false;
       // System.out.println(hasmp(nums));

    }
    public static boolean hasmp(int[] nums){
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int n : nums){
            if(h.containsKey(n)){
                h.put(n,h.get(n)+1);
            }
            else {
                h.put(n, 1);
            }
        }
        for(int i : h.values()){
            if(i>1){
                return false;
            }
        }
        return true;
    }

    public static boolean check(int []nums){
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return false;
            }
        }
        return  true;
    }

}

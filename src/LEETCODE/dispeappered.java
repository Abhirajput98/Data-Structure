package LEETCODE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class dispeappered{
    public static void main(String[] args) {
        int [ ]nums = {4,3,2,7,8,2,3,1};
//        Arrays.sort(nums);
//        List<Integer> l = new ArrayList<>();
//
//        for(int i =0;i< nums.length;i++){
//            int k = nums[i];
//            l.add(k);
//
//
//        }
//        for(int i = 0; i < nums.length; ++i){
//            if(!l.contains(i + 1)){
//                System.out.println(i + 1);
//            }
//        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; ++i){
            if(!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else
                map.put(nums[i], map.get(nums[i]) + 1);
            max = Math.max(max, nums[i]);
        }
        for(int i = 1; i <= nums.length; ++i){
            if(!map.containsKey(i))
                System.out.println(i);

        }

    }
        }

package LEETCODE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intersection_bt_twoarrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,1};
        int[] nums2 = {2,2};
        List<Integer> l = new ArrayList<>();

        for(int i =0;i<Math.min(nums1.length,nums2.length);i++){
            for(int j=0;j<Math.max(nums1.length,nums2.length);j++){
                if(nums1[i]==nums2[j] && !l.contains(nums1[i])){
                   // System.out.print(nums1[i]+" ");
                    l.add(nums1[i]);
                }

            }


        }
        int [] new1= new int[l.size()];
        for(int i =0;i<l.size();i++){
            new1[i]=l.get(i);
        }
        System.out.println(Arrays.toString(new1));

    }


}

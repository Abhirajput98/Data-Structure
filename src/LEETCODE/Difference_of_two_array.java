package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class Difference_of_two_array {
    public static void main(String[] args) {
        int [] nums1 ={1,2,3,3};
        int [] nums2 =  {1,1,2,2};
        System.out.println(findDifference(nums1,nums2));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList();
        List<List<Integer>> ll = new ArrayList();
        for(int i =0;i<nums1.length;i++){
            boolean flag=false;
            for(int j =0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    flag=true;
                }
            }
            if(flag==false && !l.contains(nums1[i])){
                l.add(nums1[i]);
            }
        }
        ll.add(l);
       // l.clear();
        List<Integer> l1 = new ArrayList();

        for(int i =0;i<nums2.length;i++){
            boolean flag=false;
            for(int j =0;j<nums1.length;j++){
                if(nums2[i]==nums1[j]){
                    flag=true;
                }
            }
            if(flag==false && !l1.contains(nums2[i])){
                l1.add(nums2[i]);
            }
        }
        ll.add(l1);
        return ll;
    }
}

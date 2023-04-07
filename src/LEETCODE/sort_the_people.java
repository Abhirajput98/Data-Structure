package LEETCODE;

import java.util.Arrays;
import java.util.TreeMap;

public class sort_the_people {
    public static void main(String[] args) {
        String []names = {"Mary","John","Emma"};
        int []heights = {180,165,170};
        TreeMap<Integer,String> l = new TreeMap<>();
        for(int i=0;i< names.length;i++){
            l.put(heights[i],names[i]);
        }
       // System.out.println(l);
        String[] sortName= new String[names.length];
        int i=sortName.length-1;

        for (int sort : l.keySet()){
            sortName[i]=l.get(sort);
            i--;
        }
        System.out.println(Arrays.toString(sortName));
    }

}

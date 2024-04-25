package LEETCODE;

import java.util.HashMap;

public class Count_Elements_With_Maximum_Frequency {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5,6};
        System.out.println(maxFrequencyElements(nums));

    }
        public static int maxFrequencyElements(int[] nums) {
            HashMap<Integer,Integer> h= new HashMap<>();
            for(int i :nums){
                if(h.containsKey(i)){
                    h.put(i,h.get(i)+1);
                }
                else{
                    h.put(i,1);
                }

            }
            int max=0;
            for(int i :h.values()){
                max=Math.max(i,max);
            }
            int number =0;
             for(int i :h.keySet()){
                 if(h.get(i)==max){
                     number+=max;
                 }
             }
             return number;



        }
}

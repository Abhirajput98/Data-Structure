package LEC_63;

import java.util.HashMap;

public class Longest_Consecutive_Sequence {
    public static void main(String[] args) {
        int [] nums = {100,4,200,1,3,2};

    }
    public static int Consecutive_sequence(int []  arr){
        HashMap<Integer,Boolean> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i]-1)){
                map.put(arr[i],false);
            }
            else {
                map.put(arr[i],true);
            }
            if(map.containsKey(arr[i]+1)){
                map.put(arr[i]+1,false);
            }


        }
        int ans=0;
        for(int key : map.keySet()){
            if(map.get(key)){
                int count=0;
                while(map.containsKey(key)){
                    count ++;
                    key++;
                }
                ans = Math.max(ans,count);
            }

        }
        return ans;
    }
}

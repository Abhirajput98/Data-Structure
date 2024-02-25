package LEETCODE;

import java.util.Arrays;

public class firstUniqChar {
    public static void main(String[] args) {
       String s= "leetcode";
       int [] ans = new int[126];
       for(int i =0;i<s.length();i++){
           int n = (s.charAt(i));
           ans[n]++;

          // System.out.println(n);
       }
       for(int i =0;i<s.length();i++){
           int n = s.charAt(i);
           if(ans[n]==1){
               System.out.println(i);

           }

        }
       // System.out.println(Arrays.toString(ans));

    }
}

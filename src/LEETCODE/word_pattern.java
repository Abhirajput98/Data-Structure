package LEETCODE;

import java.util.Arrays;

public class word_pattern {
    public static void main(String[] args) {
        String a = "abba";
        String s = "dog cat cat dog";
        String [] l = s.split(" ");
       /* System.out.println(Arrays.toString(l));
        System.out.println(matching(a,'a'));*/
        int [] arr = new int[a.length()];
        for(int i =0;i<a.length();i++){
            int k =matching(a,a.charAt(i));
            System.out.println(k);
        }


    }
    public static int matching(String s, char a){
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)==a){
                return i;
            }
        }
        return -1;
    }
}

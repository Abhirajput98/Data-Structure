package LEETCODE;

import java.util.Arrays;
import java.util.Comparator;

public class Maximum_Product_of_Word_Lengths {
    public static void main(String[] args) {
        String [] words = {"a","ab","abc","d","cd","bcd","abcd"};
         Arrays.sort(words, Comparator.comparingInt(String::length));
       // System.out.println(Arrays.toString(words));
        for(int i =words.length-1;i>=0;i--){
            int n = words[i].length();
            if(i>0 && n==words[i-1].length() && uncommon(words[i],words[i-1])){
                System.out.println(n*n);
            }

        }
       // System.out.println(uncommon("abc","vsj"));

    }
    public static boolean uncommon(String a ,String b){
        for(int i =0;i<a.length();i++){
            for(int j=0;j<a.length();j++){
                if(a.charAt(i)==b.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}

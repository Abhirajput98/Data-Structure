package LEETCODE;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s = "baa";
        String t ="baa";
        int [] freq = new int[123];
        for(int i  =0;i <s.length();i++){
            char a = s.charAt(i);
            freq[a]++;
        }
        for(int i =0;i<t.length();i++){
            char a = s.charAt(i);
            freq[a]--;
        }
        int [] newfreq = new int[123];
        for(int i =0;i<newfreq.length;i++){

        }

    }

}

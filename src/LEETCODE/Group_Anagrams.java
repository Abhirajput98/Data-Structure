package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class Group_Anagrams {
    public static void main(String[] args) {
       String [] strs = {"eat","tea","tan","ate","nat","bat"};
        List<String> s = new ArrayList<>();
        for(int i =strs.length-1;i>=0;i--){
            for(int j=i-1;j>= 0;j--){
                if(isAnagram(strs[i],strs[j] )){
                   if(!s.contains(strs[i])){
                       s.add(strs[i]);
                       s.add(strs[j]);
                   }
                   else {
                       if(!s.contains(strs[i])){
                           s.add(strs[i]);

                       }

                   }
                }


            }
        }
        System.out.println(s);

    }
    public static  boolean isAnagram(String a,String b){
        int c=0;
        for(int i =0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
                if(a.charAt(i)==b.charAt(j)){
                    c++;
                }
            }
        }
        if(c==a.length()){
            return true;
        }
        return false;


    }
}

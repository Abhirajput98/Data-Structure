package LEETCODE;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class Isomorphic_Strings {
    public static void main(String[] args) {
        String s = "paper";
        String t ="title";
        HashMap<Character,Integer> h =  new HashMap();
        HashMap<Character,Integer> h1 =  new HashMap();
        for(int i =0;i<s.length();i++){
            if(h.containsKey(s.charAt(i))){
                h.put(s.charAt(i),h.get(s.charAt(i))+1);
            }
            else{
                h.put(s.charAt(i),1);
            }
        }
        for(int i =0;i<s.length();i++){
            if(h1.containsKey(t.charAt(i))){
                h1.put(t.charAt(i),h1.get(t.charAt(i))+1);
            }
            else{
                h1.put(t.charAt(i),1);
            }
        }
        System.out.println(h);
        System.out.println(h1);
        int [] a=new int[h.size()];
        int k =0;
        int []b= new int[h.size()];
        for(int i:h.values()){
            a[k]=i;
            k++;

        }
        k=0;
        for(int i:h1.values()){
            b[k]=i;
            k++;

        }
        for(int i =0;i<a.length;i++){
            if(a[i]!=b[i]){
                System.out.println("no");
            }
        }
        System.out.println("yes");


    }
}

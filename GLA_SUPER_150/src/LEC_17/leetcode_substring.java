package LEC_17;

import java.util.Stack;

public class leetcode_substring {
    public static void main(String[] args) {
      //  System.out.println(countSubstrings("aba"));
        System.out.println(check("aba"));
       // System.out.println(pelindrome("aba"));


    }
    public static int countSubstrings(String s) {
        int count =0;
        for(int i=0;i<=s.length()-1;i++){
            for(int j=i+1; j<=s.length();j++){
                System.out.println(s.substring(i,j));
                if(check(s.substring(i,j))&& s.charAt(i)==s.charAt(j)){
                    count++;


                }
            }

        }
        return count;
    }
    public static boolean check(String a){

        int j=a.length()-1;
        for(int i =0;i<=a.length()/2;i++){
           // for(int j =a.length()-1;j>=a.length()/2;j--){
               // System.out.println(i+" "+j);
                if(a.charAt(i)!=a.charAt(j)){
                    return false;
                }
                j--;

        }
        return true;
    }

}

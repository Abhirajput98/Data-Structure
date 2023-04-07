package LEETCODE;

public class Reverse_vowels_of_string {
    public static void main(String[] args) {
        String s = "abcdopw";
        int n = s.indexOf('d');
       // System.out.println(n);
        String rev = "";
        for(int i =n;i>=0;i--){
            rev+=s.charAt(i);
        }
        //System.out.println(rev);
        String rem = "";
        for(int i =n+1;i<s.length();i++){
            rem+=s.charAt(i);
        }
        System.out.println(rev+rem);


    }
}

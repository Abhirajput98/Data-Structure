package LEETCODE;

public class Valid_pelindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        int i =0;
        System.out.println(s);
        int j =s.length()-1;
        int k=0;
        int  b=0;
        while(i<s.length()){
            char c = s.charAt(i);
            char q = s.charAt(j);
            if(Character.isLetterOrDigit(c) ){
                if(s.charAt(i)==s.charAt(j)){
                    k++;


                }


            }
            if(Character.isLetterOrDigit(c)){
                b++;
            }
            i++;
            j--;




        }
      //  System.out.println(b);
       // System.out.println(s.length());
        System.out.println(k);
}}

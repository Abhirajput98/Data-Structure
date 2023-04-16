package Recursion;

import java.util.Objects;

public class Substring {
    public static void main(String[] args) {
        String s = "bbbab";
        sub(s,"");
    }
    public static  void sub(String qst,String ans){

        if(!Objects.equals(ans ," ")  && qst.length()==0 && is_pelindrome(ans)){
            System.out.println(ans);
            return;
        }
        char a = qst.charAt(0);
        sub(qst.substring(1),ans);
        sub(qst.substring(1),ans+a);
    }
    public  static boolean is_pelindrome(String str){
        int j =str.length()-1;
        for(int  i =0;i<=str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            j--;
        }
        return true;

    }

}

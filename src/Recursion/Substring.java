package Recursion;

import java.util.Objects;

public class Substring {
    public static void main(String[] args) {
        String s = "ahbgdc";
        sub(s,"");
    }
    public static  void sub(String qst,String ans){

        if(!Objects.equals(ans ," ")  && qst.length()==0 ){
            System.out.println(ans);
            return;
        }
        char a = qst.charAt(0);
        sub(qst.substring(1),ans);
        sub(qst.substring(1),ans+a);
    }


}

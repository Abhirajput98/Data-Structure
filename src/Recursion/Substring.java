package Recursion;

public class Substring {
    public static void main(String[] args) {
        String s = "abc";
        sub(s,"");
    }
    public static  void sub(String qst,String ans){
        if(qst.length()==0){
            System.out.println(ans);
            return;
        }
        char a = qst.charAt(0);
        sub(qst.substring(1),ans);
        sub(qst.substring(1),ans+a);
    }
}

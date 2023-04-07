package Recursion;

public class count_substring {
    static int count=0;
    public static void main(String[] args) {
        String s = "abc";
        sub(s,"");
        System.out.println(count);
    }
    public static  void sub(String qst,String ans){
        if(qst.length()==0){
           // System.out.println(ans);
            count++;
            return;
        }
        char a = qst.charAt(0);
        sub(qst.substring(1),ans);
        sub(qst.substring(1),ans+a);
    }
}

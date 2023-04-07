package GLA_150_OOPS;

public class subtring {
    public static void main(String[] args) {
        String S= "abc";
        substringrec(S,"");
    }
    public static void substringrec(String s ,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }
        char a = s.charAt(0);
        String rem = s.substring(1);
        substringrec(rem, ans);
        substringrec(rem,ans+a);
    }
}

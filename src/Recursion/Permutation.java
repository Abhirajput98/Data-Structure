package Recursion;

public class Permutation {
    public static void main(String[] args) {
        String s = "ABC";
        permutation(s,"");

    }
    public static  void permutation(String qstion,String ans){
        if(qstion.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i =0;i<qstion.length();i++){
            String next = qstion.substring(i+1);
            String prev = qstion.substring(0,i);
            permutation(prev+next,ans+qstion.charAt(i));
        }
    }
}

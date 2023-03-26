package LEC_33;

public class string_permutation {
    public static void main(String[] args) {
        String s = "abc";
        String ans ="";
        permutation(s,ans);

    }
    public  static  void permutation(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;

        }
        for(int i=0;i<s.length();i++){
            String s1=s.substring(0,i);
            String s2 = s.substring(i+1);
            char c = s.charAt(i);
            permutation(s1+s2,ans+c);

        }

    }
}

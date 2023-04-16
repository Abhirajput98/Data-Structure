package Recursion;

public class Duplictate_permutation {
    public static void main(String[] args) {
        String s = "abca";
        duplicate_permo(s,"");
    }
    public static void duplicate_permo(String qstion,String ans){
        if(qstion.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i =0;i<qstion.length();i++){
            char a = qstion.charAt(i);
            boolean check=false;
            for(int j=i+1;j<qstion.length();j++){
                if(qstion.charAt(j)==a){
                    check=true;
                    break;
                }
            }
            if(check==false){
                String next = qstion.substring(i+1);
                String prev=qstion.substring(0,i);
                duplicate_permo(prev+next,ans+a);
            }


        }
    }
}

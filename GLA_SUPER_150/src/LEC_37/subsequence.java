package LEC_37;

import java.util.Scanner;

public class subsequence {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s= sc.next();
        combination(s,"",2);

    }
    public static  void combination(String ques, String ans,int n){
        if(ans.length()==n){
            System.out.println(ans);
            return;
        }
        if(ques.length()==0){
            return;

        }
        combination(ques.substring(1),ans,n);
        combination(ques.substring(1),ans + ques.charAt(0),n);

    }

}

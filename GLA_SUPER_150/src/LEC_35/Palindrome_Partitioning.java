package LEC_35;
import java.util.List;

import java.util.ArrayList;

public class Palindrome_Partitioning {
    public static void main(String[] args) {
        String s="nitin";
        String ans="";
        List<String> ll= new ArrayList<>();

        partitioning(s,ll);




    }
    public static void partitioning(String ques ,List<String> ll){
        if(ques.length()==0){
            System.out.println(ll);
            return;
        }
        for(int i =1;i<=ques.length();i++){
            String part=ques.substring(0,i);
            if(ispalindrome(part)) {
                ll.add(part);
                partitioning(ques.substring(i),ll);
                ll.remove(ll.size()-1);
            }

        }

    }
    public static boolean ispalindrome(String s){
        int k=s.length()-1;
        int c=0;
        for(int i =0;i<s.length()/2;i++){
            if(s.charAt(i)==s.charAt(k)){
                c++;
                k--;
            }
        }
        if(c==s.length()/2){
            return true;
        }
        return false;
    }
}

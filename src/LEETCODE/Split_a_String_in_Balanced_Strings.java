package LEETCODE;

import LEC_31.COINS_NO_REPEATED_h;

public class Split_a_String_in_Balanced_Strings {
    public static void main(String[] args) {
       String  s = "RLRRLLRLRL";
       int count=0;
       for(int i =0;i<s.length()-1; i++){
           for(int j =i+1;j<s.length();j++){
             //  System.out.println(s.substring(i,j));
               if(equal_L_R(s.substring(i,j))){
                   System.out.println(s.substring(i,j));
               }

           }
       }
        System.out.println(count);
        //System.out.println(equal_L_R("RRLLL"));

    }
    public static  boolean equal_L_R(String s ){
        int cl=0;
        int cr=0;
        for(int i =0;i<s.length();i++){
            if((s.charAt(i)) == 'L'){
                cl++;
            }
            else if((s.charAt(i)) == 'R'){
                cr++;
            }
        }
        if(cl==cr){
            return true;
        }
        return false;
    }
}

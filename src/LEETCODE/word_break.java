package LEETCODE;

import java.util.List;

public class word_break {
    public static void main(String[] args) {
        String s = "applepenapple";
        List<String>wordDict = List.of(new String[]{"apple","pen"});
       // System.out.println(wordDict);
        int k =0;
        for(int i =0;i<wordDict.size();i++) {
            String a = wordDict.get(i);

            //System.out.println(a);
            String qwe =check(s,a);
            System.out.println(qwe);
            if(qwe.equals(a)){
                k++;
            }

        }
        /*if(k==wordDict.size()){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }*/
    }
    public  static String check(String s, String a){
      //  int si=0;
        char q = a.charAt(0);
        //System.out.println(q);
        int k = s.indexOf(q);
       // System.out.println(k);
       // System.out.println(k);
       /* for(int i =k;i<a.length();i++){
            if(s.charAt())
        }*/
        for(int i =k;k<s.length();k++){
            if(s.substring(i,i+a.length()).equals(a)){
//                System.out.println(a);
                return a;
            }
        }
//        if(a.equals(s.substring(k,k+a.length()))) {
//            return a;
//        }
        return "false";

        //return null;
    }
}

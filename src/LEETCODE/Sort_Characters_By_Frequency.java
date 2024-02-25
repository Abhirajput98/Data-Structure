package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class Sort_Characters_By_Frequency {
    public static void main(String[] args) {
        String s = "tree";
        List<Character> L =  new ArrayList<>();
        sort(s,L);
        System.out.println(L);


    }
    public static void sort(String s, List<Character> l){

        int max=0;

        for(int i =0;i<s.length();i++){
            int c=0;
            char A='q' ;
            for(int j =0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    c++;
                    if(c>max){
                        A=s.charAt(j);
                        max=c;
                    }
                }
                if (max<c &&!l.contains(A))
                {
                    l.add(A);

                }

            }



        }
       // System.out.println(l);
    }

}

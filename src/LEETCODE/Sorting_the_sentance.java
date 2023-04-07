package LEETCODE;

import java.util.Arrays;

public class Sorting_the_sentance {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String [] l = s.split(" ");
        String ans ="";
       // System.out.println(Arrays.toString(l));
        for(int i =1;i<=l.length;i++){
          for(int j =0;j<l.length;j++){
              String k = l[j];
              char  b = k.charAt(k.length()-1);
              int n = Character.getNumericValue(b);
              //System.out.println(n);
            //  int n = Integer.to(b);
             // System.out.println(b);
              if(n==i){
//
                  ans+=k.replace(b, ' ');
              }
          }
        }
    //    System.out.println(ans.replace(,' '));
    }
}

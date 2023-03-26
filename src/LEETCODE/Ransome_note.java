package LEETCODE;

import java.util.Arrays;

public class Ransome_note {
    public static void main(String[] args) {
        String r ="aab";
        String m = "baa";

       // int j =0;
        boolean[] ans = new boolean[r.length()];
        for (int i = 0; i < r.length(); i++) {
            for(int j =0;j<m.length();j++){

                    char a = r.charAt(i);
                    char b = m.charAt(j);
                    //j++;
                    if(a==b){
                        ans[i]=true;
                        //System.out.println("1");
                    }


            }


        }
        System.out.println(Arrays.toString(ans));
        /*int c=0;
       for (int i =0;i<ans.length;i++){
           if(ans[i]){
               c++;

           }
       }
       if(c==ans.length){
           System.out.println("True");
       }
       else {
           System.out.println("False");
       }*/
    }
}

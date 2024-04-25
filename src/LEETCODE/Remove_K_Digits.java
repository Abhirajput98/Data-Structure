package LEETCODE;

import java.util.Stack;

public class Remove_K_Digits {
    public static void main(String[] args) {
       String num = "1432219";
       int k = 3;
       remove_k_degits(num,k);


    }
    public static void remove_k_degits(String s , int k ){

        Stack <Character> st = new Stack<>();
        for(int i =0;i<s.length();i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }

            while(st.peek()>s.charAt(i)  &&!st.isEmpty() ){
                k--;

                st.pop();
                st.push(s.charAt(i));

            }


        }
        System.out.println(st);



    }
}

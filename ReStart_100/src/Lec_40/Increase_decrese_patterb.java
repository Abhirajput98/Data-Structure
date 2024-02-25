package Lec_40;

import java.util.Arrays;
import java.util.Stack;

public class Increase_decrese_patterb {
    public static void main(String[] args) {
        String  s= "DD";
        System.out.println(min(s));



    }
    public static String min(String s){
//        int []ans=new int [s.length()+1];
//        int count=1;
//        for(int i =0;i<=s.length();i++){
//            if(s.charAt(i)=='I' || i==s.length()){
//                ans[i]=count;
//                count++;
//            }
//            for(int k = i-1;k>=0 && s.charAt(k)=='D';k--){
//                ans[k]=count;
//                count++;
//            }
//        }
//      //  ans[ans.length-1]=count;
//        return Arrays.toString(ans);

        Stack<Integer> st =  new Stack<>();
        int [] ans = new int[s.length()+1];
        int count=1;
        for(int i =0;i<=s.length();i++){
            if(s.charAt(i)=='I'|| i==s.length()){
                ans[i]=count;
                count++;
                while(!st.isEmpty() ){
                    ans[st.pop()]=count;
                    count++;
                }
            }
            st.push(i);

           // ans[st.peek()]=count;
        }
        return Arrays.toString(ans);
    }

}

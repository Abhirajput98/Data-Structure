package Lec_41;

import java.util.Arrays;
import java.util.Stack;

public class Remove_All_Adjacent_Duplicates_In_String {
    public static void main(String[] args) {
        String s = "abbaca";
        remove(s);
    }
    public static void remove(String s){
        Stack<Character> stack=new Stack<>();
        for(char c: s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        String  ans = "";
        for(int i =0;i<stack.size();i++){
            ans+=stack.get(i);
        }
        System.out.println(ans);

    }
}

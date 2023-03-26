package LEC_44;

import java.util.Stack;

public class stack_demo {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st.peek());  //upermost
        System.out.println(st);  // whole stack
        System.out.println(st.pop());  // remove upermost and print
        System.out.println(st);
     //   Stack<Integer> sd= new Stack<>();


    }
}

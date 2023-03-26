package LEC_46;

import java.util.Stack;

public class reverse_stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);
        Reverse(st);
        System.out.println(st);
    }

    public static void Reverse(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }

        int item = st.pop();
        Reverse(st);
        Insert_Down(st, item);

    }

    public static void Insert_Down(Stack<Integer> st, int ele) {
        // TODO Auto-generated method stub
        if (st.isEmpty()) {
            st.push(ele);
            return;
        }
        int item = st.pop();
        Insert_Down(st, ele);
        st.push(item);


    }
}

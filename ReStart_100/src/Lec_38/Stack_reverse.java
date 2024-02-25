package Lec_38;

import com.sun.jdi.IntegerType;

import javax.crypto.spec.PSource;
import java.util.Stack;

public class Stack_reverse {
    public static void main(String[] args) {
        Stack< Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println(s);
       Reverse(s);
       System.out.println(s);

//        insert_at(s,15);
//        System.out.println(s);

    }
    public static void Reverse(Stack<Integer> s ){
        if(s.isEmpty()){
            return;
        }
        int a = s.pop();
        Reverse(s);
        insert_at(s,a);
        // push(a) krne par stack reverse nhi hora tha kyuki hum element kko upr push kr rhe they ..
        // is liye nya func likha jo element ko neeche push krega staxck ke;;
    }

    public static void insert_at(Stack<Integer> st,int n){
        if(st.isEmpty()){
            st.push(n);
            return;
        }
        int a = st.pop();
        insert_at(st,n);
        st.push(a);




    }
}

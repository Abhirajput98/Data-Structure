package LEC_46;

import java.util.Stack;

public class print_bottom_stack_elemenet {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s);
        System.out.println(lastele(s));
    }
    public  static  int lastele(Stack<Integer> s){
        if(s.size()==1){
            return s.peek();
        }
        int item = s.pop();
        int x = lastele(s);
        s.push(item);
        return x;

    }
}

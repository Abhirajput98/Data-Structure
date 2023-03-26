package LEC_46;

import java.util.Stack;

public class insert_element_bottom {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        ele(s,8);
        System.out.println(s);

    }
    public  static void ele(Stack<Integer> s,int n){
        if(s.size()==0){
            s.push(n);
            return ;
        }
        int item = s.pop();
        ele(s,n);
        s.push(item);

    }
}

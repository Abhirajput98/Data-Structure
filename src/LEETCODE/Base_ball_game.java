package LEETCODE;

import java.util.Stack;

public class Base_ball_game {
    public static void main(String[] args) {
        String []ops = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(ops));


    }
    public static int calPoints(String[] arr) {
        Stack<Integer> s= new Stack<>();
        for(String i:arr){
            if(i.equals("C")){
                s.pop();

            }
            else if(i.equals("D")){
                int  a = s.pop();
                s.push(a);
                s.push(a*2);
            }
            else if(i.equals("+")){
                int a = s.pop();
                int b= s.pop();
                s.push(b);
                s.push(a);
                s.push(a+b);

            }
            else{
                s.push(Integer.parseInt(i));
            }
            //System.out.println(s.peek());
        }
        int sum=0;
        while (!s.isEmpty()){
            sum+=s.pop();


        }
        return sum;
      //  return 0;

    }
}


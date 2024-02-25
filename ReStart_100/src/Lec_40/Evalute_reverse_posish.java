package Lec_40;

public class Evalute_reverse_posish {
    public static void main(String[] args) {
        String []tokens = {"2","1","+","3","*"};
        System.out.println(stack(tokens));

    }

    public static int stack (String []arr){
        int [] stack = new int[arr.length];
        int top=0;
        for(String i : arr){
            if(i.equals("+")){
                int a = stack[--top];
                int b = stack[--top];
                stack[top]=a+b;
                top++;

            }
            else if(i.equals("-")){
                int a = stack[--top];
                int b = stack[--top];
                stack[top++]= b - a;
            }
            else if(i.equals("*")){
                int a = stack[--top];
                int b = stack[--top];
                stack[top++]=a*b;

            } else if(i.equals("/")){
                int a = stack[--top];
                int b = stack[--top];
//                if(a == 0 || b == 0){
//                    stack[top++] = 0 ;
//                }
//                else{
//                    stack[top++]=Math.max(a,b)/Math.min(a,b);
//                }
                stack[top++]=b/a;


            }
            else{
                stack[top]=Integer.parseInt(i);
                top++;
            }
        }
        return stack[0];
    }
        }

package LEC_7;

public class Function_Parameterised {
    public static void main(String[] args) {
        System.out.println("hello");
        int a=7;
        int b=23;
        addition(a,b);
    }
    public static void addition(int a,int b){
        int c= a+b;
        sub(a,b);
        System.out.println(c);
    }
    public static void sub(int a,int b){
        int c=a-b;
        System.out.println(c);

    }
}

package LEC_7;

public class Function_Returnt {
    static int val=100;
    public static void main(String[] args) {
        System.out.println("hello");
        int a=7;
        int b=23;
       // addition(a,b); // print nhi hua
        System.out.println(addition(a,b));
        System.out.println(val);
        // val ki value 100
    }
    public static int addition(int a, int b){
        // val 95;
        int c= a+b;
       // sub(a,b);
        int val=90; // agr int nhi likhenge th global wala variablr hi aayega << val=100;
        Function_Returnt.val=val+5;
        return c;


    }

}

package GLA_150_OOPS;

public class Recursion {
    public static void main(String[] args) {
        int n =5;
        System.out.println(factorial(n));
    }
    public  static int factorial(int n ){
        if(n==1){
            return 1;
        }
         int f= factorial(n-1);
         return f*n;

    }
}





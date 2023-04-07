package Recursion;

public class print_dec_inc {
    public static void main(String[] args) {
        int n =5;
        deC_inc(5);

    }
    public  static void deC_inc(int n){

            if(n==0){
                return;

            }
            System.out.println(n);
            deC_inc(n-1);
        System.out.println(n);


        }
    }


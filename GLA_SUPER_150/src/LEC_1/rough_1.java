package LEC_1;
import java.util.Scanner;

public class rough_1 {
    public static void main(String[] args) {
        int n=5;
        System.out.println(print(n));


    }
    public static  int  print(int n){
        if(n==0){
            return 1 ;
        }
        int k=print(n-1);
        return  k*n;




    }
}



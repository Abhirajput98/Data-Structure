package LEC_50.LEC_29;

import java.util.Scanner;

public class RECUSION_BASIC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        System.out.println(fac(T));

    }

    public static int fac(int n ){
        // BASE CODE
        if(n==0){
            return 1; // FOR CONTROLING STACK OVERFLOW;
        }
        int fn = fac(n-1); // CALLING SELF FUNCTION;
        return n*fn;



    }
}

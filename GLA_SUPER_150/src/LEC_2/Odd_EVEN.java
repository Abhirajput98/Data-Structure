package LEC_2;

import java.util.Scanner;

public class Odd_EVEN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("even");

        }
        else{
            System.out.println("odd");
        }
    }
}
package LEETCODE;

import java.util.Scanner;

public class reverse_the_bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int mul=1;
        while(n!=0){
            int rem=n%10;
            sum=sum+rem*mul;
            n=n/10;
            mul=mul*n%2;

        }
        System.out.println(sum);
    }
}

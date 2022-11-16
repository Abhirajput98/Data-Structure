package LEC_1;

import java.util.Scanner;

public class Armstong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a= n;
        int c=a;
        int l =0;
        int sum=0;
        while(n!=0){
            l++;
            n=n/10;

        }
        while(a!=0){
            int b = a%10;
            sum=sum+ (int)Math.pow(b,l);
            a=a/10;

        }
        if(sum==c){
            System.out.println("yes ");
        }
        else{
            System.out.println("no");
        }
    }
}

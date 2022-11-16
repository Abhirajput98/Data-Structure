package LEC_1;
import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==arm(n)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    public static int arm(int k){
        int sum=0;
        int l =(int) (Math.log10(k) + 1);
        while(k!=0){
            int b = k%10;
            sum = sum + (int)(Math.pow(b,l));
            k=k/10;
        }
        return sum;
    }
}

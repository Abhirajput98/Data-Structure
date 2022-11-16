import java.util.Scanner;

public class SumOfDigitsEntered {
    public static void main( String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("enter the number between 0 to 1000");
        int num = a.nextInt();
        int l=num%10;
        int q= num/10;
        int w= q%10;
        int e=q/10;
        int r = e%10;
        int sum= l+w+r;
        System.out.println("the digit sum of "+ num + " is  : "+ sum);
    }
}


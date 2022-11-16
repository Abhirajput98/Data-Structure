import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        int sum = 0;
        int b = 0;
        while (a > 0) {
            b = a % 10;
            sum = sum + b;
            a = a / 10;
        }
        System.out.printf(" the sum of digits of the number is %d", sum);


    }
}

import java.util.Scanner;

public class reverseTheNumbes {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number");
    int a = sc.nextInt();
    System.out.println("enter the second number");
    int b = sc.nextInt();
    int c = 0;
    c = a;
    a = b;
    b = c;
    System.out.printf("number after reversing %d  %d", a, b);
    }
}

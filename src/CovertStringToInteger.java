import java.util.Scanner;

public class CovertStringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the STRING");
        String s = sc.next();
        int b = Integer.parseInt(s);
        System.out.printf("the Integer value of the string is: %d", b);

    }
}

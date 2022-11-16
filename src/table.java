import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a= sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        if (a!=b) {
            System.out.printf("%d != %d", a, b);
            System.out.println();
        }
        if (a<b){
            System.out.printf("%d < %d",a,b);
            System.out.println();

        }
        if(a==b){
            System.out.printf("%d = %d",a,b);
            System.out.println();

        }
        if (a<=b){
            System.out.printf("%d <= %d",a,b);
        }



    }
}

package LEC_2;
import java.util.Scanner;
public class Maximum_3NUMBER {
    public static void main(String[] args) {
        System.out.println("enter the numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if (a>b && a>c){
            System.out.println(a+ " IS GREATER");
        }
        else if (b>a && b>c){
            System.out.println(b +" IS GREATER");
        }
        else{
            System.out.println(c +" IS GREATER");
        }

    }
}

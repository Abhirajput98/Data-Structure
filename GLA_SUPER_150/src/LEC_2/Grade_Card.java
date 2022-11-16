package LEC_2;
import java.util.Scanner;
public class Grade_Card {
    public static void main(String[] args) {
        System.out.println("enter the marks");

        Scanner sc = new Scanner(System.in);
        int marks =sc.nextInt();
        if (marks>70){
            System.out.println("A");
        }
        else if ( marks>60 && marks<=70){
            System.out.println("B");

        }
        else if( marks>50 && marks<=60){
            System.out.println("C");
        }
        else if ( marks > 40 && marks<=50){
            System.out.println("D");

        }
        else if (  marks >30 && marks<=40){
            System.out.println("PASS");
        }
        else{
            System.out.println("Fail");
        }

    }
}

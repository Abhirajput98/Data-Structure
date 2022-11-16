package LEC_2;
import java.util.Scanner;

public class Loops_Pattern {
    public static void main(String[] args) {
        /*

        *****
        *****
        *****
        *****


        int row=1;
        while(row<=5){
            int i =1;
            while(i<=5){
                System.out.print("*");
                i++;
            }
            System.out.println();
            row++;
            */
        /*


        *
        **
        ***
        ****
        *****

      */
        Scanner sc = new Scanner(System.in);
        int i=1;
        int j=1;

        System.out.println("enter the number of rows");
        int n = sc.nextInt();
        while(i<=n){
            i=1;
            while (j<=i+1){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;






        }

    }
}

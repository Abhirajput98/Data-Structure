package LEC_2;
import java.util.Scanner;
/*
 *
 ***
 *****
 *******
 *********



 */


public class Pattern_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row=1;
        int spaces=n;
        int star=1;
        while(row<=n){
            int i = 1;
            while( i<=spaces){
                System.out.print("  ");
                i++;
            }
            int j=1;
            while (j<=star){
                System.out.print("* ");
                j++;
            }
            spaces--;
            star=star+2;
            System.out.println();
            row++;

        }

    }
}

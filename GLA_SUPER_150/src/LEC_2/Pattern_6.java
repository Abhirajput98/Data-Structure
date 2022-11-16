package LEC_2;
import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args) {

        int row = 1;
        int space = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n;
        while(row<=n){
            int i =1;
            while (i<=space){
                System.out.print("  ");
                i++;
            }
            int j =1;
            while(j<=star){
                System.out.print("* ");
                j++;

            }
            space= space+2;
            star--;
            System.out.println();
            row++;
        }

    }




}

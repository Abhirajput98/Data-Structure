package LEC_2;
import java.util.Scanner;

public class Pattern_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star =1;
        int space =4;
        while (row<=9){
            int i =1;
            while (i<=space){
                System.out.print(" ");
                i++;
            }
            int j =1;
            while(j<=star){
                if (j%2==0){
                    System.out.print(" ");
                    j++;

                }
                else{
                    System.out.print("*");
                    j++;

                }

            }
            space--;
            star=star+2;
            System.out.println();
            row--;

        }

    }
}

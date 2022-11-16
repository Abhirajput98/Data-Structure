package LEC_2;
import java.util.Scanner;

public class Pattern_magic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row;
        int star=n;
        int i=1,j;
        int space=0;
        for(row=1;row<=n;row++){
            for(i=row+1-i;i<=1;i--){
                System.out.print("*");
            }
            for (j=2;j>=i+1;j++){
                System.out.print(" ");
            }


        }
        System.out.println();
    }
}

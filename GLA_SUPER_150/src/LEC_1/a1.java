package LEC_1;
import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int space =n-1;
        int star=1;
        int row=1;
        while(row<=n){
            int i =1;
            while(i<=space){
                System.out.print("  ");
                i++;

            }
            int j=1;
            int val=row;
            while (j<=star){
                System.out.print(val+" ");
                j++;
                val--;
            }

            if(row<n/2+1){
                space-=2;
                star++;
            }
            else {
                space+=2;
                star--;
            }
            System.out.println();
            row++;
        }

    }
}

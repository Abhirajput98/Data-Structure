package LEC_4;
import java.util.Scanner;

public class Fabnaccii_nth_tern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1=0;
        int n2=1;
        int i =1;
        int n3=0;
        while(i<=n){
            n3=n1+n2;
            n1=n2;
            n2=n3;

            i++;

        }
        System.out.println(n1);
    }
}

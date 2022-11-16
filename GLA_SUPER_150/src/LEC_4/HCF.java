package LEC_4;
import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int divisor= sc.nextInt();
        int divider = sc.nextInt();
        while(divider%divisor!=0){
            int rem = divider%divisor;
            divider=divisor;
            divisor=rem;
        }

        System.out.println(divisor);
    }
}

package LEC_7;
//import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class aa {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int i=2;
        int sum=0;
        while(n/i==0){
            if(n%i==0){
                sum=sum+SOD(i);
            }
            n=n/i;
            i++;

        }
        System.out.println(sum);

    }
    public static int SOD(int i){
        int k=0;
        while(i!=0){
            int b=i%10;
            k=k+b;
            i=i/10;

        }
        return (k);

    }
    }

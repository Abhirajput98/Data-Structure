import java.util.Scanner;

public class fahrenheitToCelsius {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int min= sc.nextInt();
            int max=sc.nextInt();
            int division= sc.nextInt();
            int i=min;
            while(i<max){
                int k=i;
                i+=division;
                float c = (k-32)*0.555555f;
                System.out.println(i+"    "+(int)c);

            }






        }

    }


package LEC_12;
import java.util.Scanner;

public class assn_sum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int a = sc.nextInt();
        int m = 1;
        while (m <= a) {
            int b = sc.nextInt();
            int k = arr[0];
            int s = arr[n - 1];

            if (b == 1) {
                for (int i = n - 1; i > 0; i--) {
                    arr[i] = arr[i] + arr[i - 1];


                }
                arr[0] = k + s;
            } else {
                for (int i = 0; i < n; i++) {
                    arr[i] = arr[i] + arr[i];
                }
            }
            m++;

        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];

        }
        System.out.println(sum%((int)Math.pow(10,9)+7) );

    }
    }


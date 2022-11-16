package LEC_1;
import java.util.Scanner;

public class rough_1 {
    public static void main(String[] args) {
        int x = 123;
        int k = x;


        int l = (int) Math.log10(x) + 1;
        int[] arr = new int[l];
        int[] rev = new int[l];
        int i = 0;
        int j = l;
        while (k != 0) {
            int b = k % 10;
            rev[j - 1] = b;
            j--;
            k /= 10;
        }
        while (x != 0) {
            int c = x % 10;
            arr[i] = c;
            i++;
            x /= 10;

        }
        for(int m =0 ;i<l;i++){
            System.out.println(arr[i]+" " + rev[i]);
        }
    }
}



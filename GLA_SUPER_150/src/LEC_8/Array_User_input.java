package LEC_8;
import java.util.Scanner;
public class Array_User_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int n = sc.nextInt();
        arr= new int[n];
        int i=0;
        while(i<n){
            int a=sc.nextInt();
            arr[i]=a;
            i++;
        }
        for(int j=0;j<n;j++){
            System.out.print(arr[j]);
            }
        }
    }


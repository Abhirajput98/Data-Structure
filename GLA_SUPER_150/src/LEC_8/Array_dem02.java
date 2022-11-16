package LEC_8;

import java.util.Scanner;

public class Array_dem02 {
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
        swap(arr,0,1);

    }
    public static void swap(int[] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

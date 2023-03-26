package Codechef;

import java.util.Scanner;

public class MIN_To_MAX {
    public static void main(String[] args) {
        //int [] arr ={1};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int min = Integer.MAX_VALUE;
            int[] arr = new int[a];
            for (int j = 0; j < a; j++) {
                arr[j] = sc.nextInt();
                min = Math.min(min, arr[j]);

            }
            System.out.println(minelement(arr, min));

        }
    }
    public static int minelement(int [] arr,int m){
        int c =0;
        for(int i =0;i<arr.length;i++){
            if(m<arr[i]){
                c++;
            }
        }
        return c;
    }
}

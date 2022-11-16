package LEC_20;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrays_sum_Of_two_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int [] list1 = new int[n];

        int n = sc.nextInt();
        int[] list1 = new int[n];

        for (int i = 0; i < n; i++) {
            list1[i] = sc.nextInt();

        }
        int n1 = sc.nextInt();
        int d = n - n1;

        int[] list2 = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < d) {
                list2[i] = 0;
            } else {
                list2[i] = sc.nextInt();

            }


        }
        int sum=0;
        int [] s= new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int rem =((list1[i]+list2[i])%10);
            int k=(list2[i]+list1[i])/10;
            s[i]=rem+sum;

            //System.out.print(rem+sum+" ");
            sum=(list1[i]+list2[i]+k)/10;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(s[i]+ " ");
        }
    }}

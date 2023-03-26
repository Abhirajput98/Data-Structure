package LEETCODE;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascal_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int row=0;
        int star=1;
        //ArrayList<Integer> l1 = new ArrayList<>();
         List < List<Integer>> L  = new ArrayList<>();
        while(row<n){
            ArrayList<Integer> l1 = new ArrayList<>();

            int i=0;
            int val=1;
            while(i<star){
                //System.out.print(val+" ");
                l1.add(val);
                val=((row-i)*val)/(i+1);
                i++;
            }
            L.add(l1);
            row++;
            star++;


        }
        System.out.print(L);



    }
}

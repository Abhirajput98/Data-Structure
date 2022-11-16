package LEC_14;

import java.util.Scanner;

public class GLA_2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n,m;
        int [][]arr ;
        System.out.println("enter the size of rows");
        n=sc.nextInt();
        System.out.println("enter the size of coloms");
        m=sc.nextInt();
        arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                int a=sc.nextInt();
                arr[i][j]=a;
            }
        }
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0 ){
                    for(int k=i;k<m;k++){
                        arr[i][j]=0;
                    }

                }
            }
        }
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        }
    }


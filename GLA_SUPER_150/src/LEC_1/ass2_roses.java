package LEC_1;

import java.util.*;

public class ass2_roses {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int k=0;
        while(n!=0){
            int a= sc.nextInt();
            int [] arr = new int [a];
            for(int i =0;i<a;i++){
                arr[i]=sc.nextInt();

            }
            int target= sc.nextInt();
            int l=0;
            int w=0;
            for(int i =0;i<a;i++){
                for(int j=i+1;j<a;j++){
                    int diff=0;

                    if(arr[i]+arr[j]==target && diff<Math.abs(arr[i]-arr[j])){
                        l=i;
                        w=j;
                    }

                }
            }n--;
            if(arr[l]<arr[w]){
                System.out.println("Deepak should buy roses whose prices are "+ arr[l]+" and "+arr[w]+".");
            }
            else{
                System.out.println("Deepak should buy roses whose prices are "+ arr[w]+" and "+arr[l]+".");
            }

        }

    }

}

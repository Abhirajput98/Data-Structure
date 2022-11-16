package LEC_9;
import java.util.Arrays;
import java.util.Scanner;

public class arr_circular_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n!=0) {
            int a = sc.nextInt();
            int[] arr = new int[a];
            for (int i = 0; i < a; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(sum(arr));
            n--;
        }
    }
    public static int sum(int[] arr){
        int l = arr.length;
        int [] left = new int[l];
        int [] right = new int [l];
        left[0]=0;
        right[l-1]=0;

        for(int i =0;i<l;i++){
            int sum=0;
            for(int j = i+1;j<l;j++){
                sum+=arr[j];

            }
            right[i]=sum;


        }
        for(int i =1;i<l;i++){
            int sum=0;
            for(int j =i-1;j>=0;j--){
                sum+=arr[j];
            }
            left[i]=sum;
        }
        int sum=Integer.MIN_VALUE;
        int [] result= new int[l];
        for(int i =0;i<l;i++){
            result[i]=left[i]+right[i];
            if(result[i] > sum)
                sum = result[i];

        }
        return sum;




    }

}

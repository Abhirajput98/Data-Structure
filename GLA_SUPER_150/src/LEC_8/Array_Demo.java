package LEC_8;
import java.util.Scanner;

public class Array_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr=new int[5];
        int[]obj=arr; // bs ek hi array bnega stack
         //int obj[];  c style dicleration
        //value get
        System.out.println(arr.length);
        System.out.println(arr[0]); //0
        System.out.println(arr[1]);//1
        // set the value;

        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        System.out.println(arr[0]); //<< 10
        System.out.println(arr[1]); // <<20




    }
}

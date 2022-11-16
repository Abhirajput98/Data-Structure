package LEC_9;

import java.util.Arrays;

public class array_reverse {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,88,};
        rev(arr);
    }
    public static void rev (int [] arr){
        int n = arr.length-1;
        for(int i =0 ; i< arr.length/2;i++){
            int temp = arr[i];
            arr[i]=arr[n];
            arr[n]=temp;
            n--;

        }
        System.out.println(Arrays.toString(arr));

    }
}

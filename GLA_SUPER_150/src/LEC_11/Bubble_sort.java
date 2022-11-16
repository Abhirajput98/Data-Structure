package LEC_11;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int []  arr ={3,1,5,2,4};
        for(int k = 0 ;k< arr.length-1;k++){
            for(int i = 0 ; i< arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;

                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}

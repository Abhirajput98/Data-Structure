package Recursion;

public class first_occurance {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(index(arr, 0, 8));

    }

        public static int index(int [] arr, int i,int n){
        if(n>arr.length){
            return -1;
        }
        if(arr[i]==n){
            return i;

        }
         return index(arr,i+1,n);
    }
}

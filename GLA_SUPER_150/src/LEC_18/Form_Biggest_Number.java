package LEC_18;

public class Form_Biggest_Number {
    public static void main(String[] args) {
        int[] arr = {};
    }

    public static int[] BubbleSort(int[] arr) {
        // int []  arr ={3,1,5,2,4};
        for (int k = 0; k < arr.length - 1; k++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                }
            }

        }
        return arr;
    }
}

package LEC_9;

public class array_max {
    public static void main(String[] args) {
        int[] arr = {1, 8, 9, 3, 6};
        System.out.println(max(arr));

    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }
}


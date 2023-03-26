package LEETCODE;

public class sorted_arr {
    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 2};
        int n = 7;
        System.out.println(seach(arr,2));

    }

    public static int seach(int[] arr, int target) {
        int si = 0;
        int l = arr.length - 1;

        while (si <= l) {
            int mid = (si + l) / 2;
            if (arr[mid] == target) {
                return mid;

            } else if (arr[mid] > target) {
                l = mid - 1;

            } else {
                si = mid + 1;

            }

        }
        return -1;
    }
}

package Lec_40;

import javax.print.DocFlavor;
import java.util.Stack;

public class Largest_Rectangle_in_Histogram {
    public static void main(String[] args) {
        int [] arr ={2,3,5,4,6,1,7};
        System.out.println(Rectangle(arr));
    }
    public static int Rectangle(int [] arr){
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {

            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {

                int r = i;
                int h = arr[st.pop()];
                if (st.isEmpty()) {
                    ans = Math.max(ans, h * r);

                } else {
                    int l = st.peek();
                    ans = Math.max(ans, h * (r - l - 1));
                }

            }
            st.push(i);

        }

        int r = arr.length;
        while (!st.isEmpty()) {

            int h = arr[st.pop()];
            if (st.isEmpty()) {
                ans = Math.max(ans, h * r);

            } else {
                int l = st.peek();
                ans = Math.max(ans, h * (r - l - 1));
            }
        }

        return ans;

    }
}

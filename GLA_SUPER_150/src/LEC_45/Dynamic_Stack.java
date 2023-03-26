package LEC_45;

//import java.util.Stack;
import LEC_44.stack;

public class Dynamic_Stack extends stack {
    public void push(int item) throws Exception {
        if (this.isfull()) {
            int[] a = new int[2 * arr.length];
            for (int i = 0; i < arr.length; i++) {
                a[i] = arr[i];
            }
            arr = a;

        }
        super.push(item);

    }

}

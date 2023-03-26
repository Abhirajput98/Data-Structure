import java.util.Queue;
import java.util.Stack;

public class Coading_Blocks {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public void Queue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void enqueue(int x) {
        s1.push(x);
    }

    public int dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        if (!s2.isEmpty()) {
            return s2.pop();
        } else {
            return -1; // or throw an exception
        }
    }


    // Test the Queue class
}

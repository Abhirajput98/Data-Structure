package Lec_38;

import Lec_37.DynamicQueue;

import java.sql.SQLOutput;
import java.util.Queue;

public class Queue_reverse {
    public static void main(String[] args) throws Exception {
        DynamicQueue Q = new DynamicQueue();
        Q.Enqueue(10); Q.Enqueue(20); Q.Enqueue(30); Q.Enqueue(40); Q.Enqueue(50);
        Q.Display();
        System.out.println("***********");
        reverse(Q);
        Q.Display();
    }
    public static void reverse(DynamicQueue q) throws Exception {
        if(q.isEmpty()){
            return ;
        }
        int x = q.Dequeue();
        reverse(q);
        q.Enqueue(x);


    }
}

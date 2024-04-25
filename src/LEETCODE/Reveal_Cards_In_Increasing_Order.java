package LEETCODE;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Reveal_Cards_In_Increasing_Order {
    public static void main(String[] args) {
        int []  deck = {1,1000};
        Arrays.sort(deck);
        Queue<Integer> q = new LinkedList<>();

        for(int i =0;i< deck.length;i++){
            q.add(i);
        }
        int [] ans =new int [deck.length];
        // deck 2 3 5 7 11 13 17
        // q = 0 1 2 3 4 5 6

        for(int i =0;i< ans.length;i++){
            ans[q.poll()]=deck[i];
//            int ele = q.poll();
            q.add(q.poll());
        }
      //  System.out.println(i);

        System.out.println(Arrays.toString(ans));
    }
}

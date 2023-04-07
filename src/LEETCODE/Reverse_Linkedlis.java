package LEETCODE;

import LEC_49.Linked_List;

import java.util.LinkedList;

public class Reverse_Linkedlis {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.add(1);
        LinkedList<Integer> l1 = new LinkedList<>();
        for(int i =ll.size()-1;i>=0;i--){
            l1.add(ll.get(i));
        }
        System.out.println(l1);
    }
}

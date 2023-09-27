package LEC_50;

import LEC_49.Linked_List;

public class LinkedList_Circular {
    public static class  Node{
    public int val;
    public Linked_List.Node Next;
}

    private Linked_List.Node head;  //  contains int and adress of next node  << Linked list class member
    private  int size;
    private Linked_List.Node tail;
    public   void AddFirst(int item){
        Linked_List.Node nn = new Linked_List.Node();
        nn.val=item;
        if(size==0){
            head=nn;
            tail=nn;
            size++;
        }
        else {
            nn.Next=head;
            head=nn;
            size++;
        }
    }
    public   void Display(){
        Linked_List.Node temp = head;
        while (temp!=null){
            System.out.println(temp.val+"<");
            temp= temp.Next;

        }
        System.out.println(".");


    }
    public  void AddLast(int item){
        if(size==0){
            AddFirst(item);

        }
        else {
            Linked_List.Node nn = new Linked_List.Node();
            nn.val= item;
            tail.Next= nn;  // tail ka ko next jo null tha ab usee update kiya jiko add kiya h
            tail=nn;
            size++;

        }

    }


}

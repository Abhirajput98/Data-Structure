package LEC_49;


public class Linkedlist_client {
    public static void main(String[] args) throws Exception {
        Linked_List ll = new Linked_List();
        ll.AddFirst(5);
        ll.AddFirst(4);
        ll.AddFirst(3);
        ll.AddFirst(2);
        ll.AddFirst(1);
    //    ll.Display();
        ll.addatindex(2,2);
        ll.Display();



    }
}

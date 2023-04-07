package LEC_49;



public class Linked_List {
  public class  Node{
      int val;
      Node Next;
  }

    private  Node head;  //  contains int and adress of next node  << Linked list class member
    private  int size;
    private  Node tail;
    public   void AddFirst(int item){
        Node nn = new Node();
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
        Node temp = head;
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
            Node nn = new Node();
            nn.val= item;
            tail.Next= nn;  // tail ka ko next jo null tha ab usee update kiya jiko add kiya h
            tail=nn;
            size++;

        }

    }
    public Node GetNode(int k ) throws Exception{
        if(k<0 || k>=size){
            throw new Exception("Value th range mein de ");
        }
        Node temp  = new Node();
        for(int i =1;i<=k;i++){
            temp= temp.Next;
        }
        return temp;
    }
    public void addatindex(int item, int k) throws Exception {
        if(k<0 || k>size) {
            throw new Exception("bklol k range mein likh");
        }
        if(k==0) {
                AddFirst(item);
        }
        else if(k==size) {
            AddLast(item);
        }
        else {
            Node nn=new Node();
            nn.val=item;
            Node k_1th=GetNode(k-1);
            Node kth=k_1th.Next;
            k_1th.Next=nn;
            nn.Next=kth;
            this.size++;
        }
    }
    public int getFirst(){
        return head.val;
    }
    public int getLast(){
        return tail.val;
    }
    public int getatIndex(int k) throws Exception{
        return GetNode(k).val;
    }
    public int removeFirst() throws Exception{
        if(size==0){
            throw new Exception("Linkeed list empty");
        }
        int rv=head.val;
        if(size==1){
            head=null;
            tail =null;
            size--;
        }
        else {
            Node temp = head;
            head = head.Next;
            temp.Next= null;
            size--;


        }
        return rv;

        }





}

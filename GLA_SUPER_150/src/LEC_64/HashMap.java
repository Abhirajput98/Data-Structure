package LEC_64;

import LEC_49.Linked_List;

import java.util.ArrayList;

//load factor = numbear of elemenet devided by bcket size
public class HashMap <K,V>{
    class Node {
        K key ;
        V value;
        Node next;
    }
    ArrayList<Node>ll;
    private  int size =0;
    public HashMap(int n){
        ll = new ArrayList<>();
        for (int i =0;i<n;i++){
            ll.add(null);
        }
    }
    public HashMap(){
        this(4);

    }
    public int hashfun(K key){
        int bn = key.hashCode()%ll.size();
        if(bn<0){
            bn= bn+ll.size();
        }
        return bn;

    }
    public void put (K key ,V value){
        int idx = hashfun(key);
        Node temp = ll.get(idx);
        while (temp!=null){
            if(temp.key.equals(key)){
                temp.value=value;
                return;
            }
            temp=temp.next;

        }
        Node nn = new Node();
        nn.key=key;
        nn.value= value;
        temp = ll.get(idx);
        nn.next=temp;
        ll.set(idx,nn);
        size++;
        double thf= 2.0;
        double lf = (1.0*size)/ ll.size();
        if(lf>thf){
            rehashig();
        }


    }
    public void rehashig(){
        ArrayList<Node> new_List = new ArrayList<>();
        for(int i =0; i<2* ll.size();i++){
            new_List.add(null);

        }
        ArrayList<Node>  oba= ll;
        ll= new_List;
        for(Node temp : oba){
            while (temp!=null){
                put(temp.key, temp.value);
                temp=temp.next;
            }
        }
    }

    public V get (K key){
        int idx = hashfun(key);
        Node temp = ll.get(idx);
        while (temp!=null){
            if(temp.key.equals(key)){

                return temp.value;
            }
            temp=temp.next;
        }
        return null;
    }
    public boolean contains_key(K key){
        int idx = hashfun(key);
        Node temp = ll.get(idx);
        while (temp!=null){
            if(temp.key.equals(key)){

                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public V remove(K key){
        int idx = hashfun(key);
        Node curr= ll.get(idx);
        Node prev = null;
        while (curr!=null){
            if(curr.key.equals(key)){
                break;
            }
            prev=curr;
            curr=curr.next;

        }
        if(curr==null){
            return null;
        }
        else if (prev==null){
            ll.set(idx,curr.next);
            curr.next=null;
            size--;
            return curr.value;
        }else {
            prev.next=curr.next;
            size--;
            curr.next=null;
            return curr.value;
        }



    }
    @Override
    public String toString(){
        String s= "{";
        for(Node temp :ll){
            s=s+temp.key+"="+temp.value+", ";

        }
        return  s+"}";


    }





}
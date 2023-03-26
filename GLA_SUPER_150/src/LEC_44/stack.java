package LEC_44;

import GLA_150_OOPS.Person;

public class stack {
    protected int [] arr;
    int tos;
    public stack(){
        arr= new int[5];
        tos=-1;
    }
    public stack(int n){
        arr=new int[n];
        tos=-1;
    }
    public boolean isEmpty(){
        return  tos==-1;

    }
    public  boolean isfull(){
        return  tos==arr.length-1;
    }
    public void push(int item) throws Exception{

        if(isfull()) {
            throw new Exception("full hai");
        }
            tos++;
            arr[tos]=item;


    }
    public  int pop()throws  Exception {
        if(isEmpty()){
            throw  new Exception("Empty hogya");
        }

            int x = arr[tos];
            tos--;
            return x;



    }
    public  int peek()throws  Exception{
        if(isEmpty()){
            throw  new Exception("khali hai");
        }
        int x= arr[tos];
        return x;
    }
    public void Display(){
        for(int i =0;i<=tos;i++){
            System.out.println(arr[i]+"->");
        }
        System.out.println(".");
    }
}

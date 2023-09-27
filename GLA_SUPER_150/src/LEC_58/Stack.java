package LEC_58;

public interface Stack extends Dynamic_Stack,Data_Str {
    public void push (int item);
    public int pop ();
    public int peek();
   // int x=9; //invisible keyword public final int
    // jb kisi class ke age final keyword lag gya wh method kbhi bhi inheritate ngi hoga
    public static final int x=9;

//    default void fun(){
//
//    }
//    public static int fun1(){
//        return 0;
//
//    }
//    public static int fun2(){
//        return -0; // this feature is of java 9
//    }
}

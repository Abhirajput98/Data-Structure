package LEC_21;

public class String_Vs_StringBuilder {
    public static void main(String[] args) {
        StrinCom(); // it will take more time;
        StringBuilder();  //  it will take less time



    }
    public static void StrinCom(){
        String s= "";
        for(int i=0;i<1000;i++){
            s+=i;
        }
        System.out.println(s);
    }
    public  static void StringBuilder(){
        StringBuilder a = new StringBuilder();
        for(int i=0;i<1000;i++){
            a.append(i);
        }
        System.out.println(a);

    }
}

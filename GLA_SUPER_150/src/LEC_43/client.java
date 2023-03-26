package LEC_43;

public class client {
    public static void main(String[] args) {
       // p obj = new p();
       // C  obj1= new C();
        p obj = new C();
        System.out.println(obj.d); // p
        System.out.println(obj.d1); //  p mein jo value hai
      //  System.out.println(obj.d2); // not accseeeble
        System.out.println(((C)(obj)).d2);


    }
}

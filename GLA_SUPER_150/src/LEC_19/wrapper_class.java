package LEC_19;

public class wrapper_class {
    public static void main(String[] args) {
        // corresponding to non primitvie data type is wrapper class;
        /*
        byte -- Byte
        short -- Short
         */
        Integer a=10;
        int a1=10;
        a=a1;// pri--ko change non primitive ------ AutoBoxing;
        int b=-6;
        Integer b1=-444;
        b=b1; //  non --> ko chnge primitve ---  OnBoxing;
        Integer c=10;
        Integer c1=10;
        Integer c2=178;
        Integer c4=178;
        System.out.println(c==c1);   //  True
        System.out.println(c2==c4);   //  False range -128 -  127;  its is a range pg BYte;;
    }
}

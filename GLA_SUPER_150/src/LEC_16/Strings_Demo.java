package LEC_16;

public class Strings_Demo {
    public static void main(String[] args) {
        String str="Hello"; // it willl be created in pool--
        String str1="Hello"; // it will be created ouside the pool
        String str2= new String("Hello");
        String str3= new String("Hello");
        System.out.println(str==str2); // compares address
        System.out.println(str.equals(str3)); // compare contant;
        //--- pool se bhr --  user input , +  , concate  //

    }
}

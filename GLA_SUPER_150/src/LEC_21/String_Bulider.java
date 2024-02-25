package LEC_21;

public class String_Bulider {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // Builder is same as String but it is more faster ;

        System.out.println(sb.length()); //  gives size of sb;
        System.out.println(sb.capacity());  //
        StringBuilder s = new StringBuilder("hello"); //  16 + length of hello;
        System.out.println(s.length());  // size = 0+length of hello;
        System.out.println(s.capacity());
        s.append('v');
        System.out.println(s.capacity());  //  cpacity dosnt chge;
        System.out.println(s);  //  original+'v';
        System.out.println(s.length()); //  size = 5+1;
        // grows by = old*2 +2;
        /*
        builder content into  string
        * */
        String a = s.toString();
        System.out.println(s.reverse()); // reverse the whole builder ,chnges in original builder
        System.out.println(s.charAt(2)); // print char at index 2;
        System.out.println(s.substring(1,2)); // same as to find substring in string ;




    }
}

package LEETCODE;

public class Defanging_an_IP_Address {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String A = address.replace(".","[.]");
        System.out.println(A);
    }
}

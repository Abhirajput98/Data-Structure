package LEETCODE;

public class Find_the_difference {
    public static void main(String[] args) {
        String s = "a";
        String t = "aa";
        int sum=0;

        for (int i=0; i< t.length(); i++){

            sum+= t.charAt(i);
            //System.out.println(sum);
        }

        for (int i=0; i< s.length(); i++){

            sum-= s.charAt(i);
        }
        System.out.println((char)sum);

    }
}

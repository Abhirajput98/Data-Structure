package LEC_17;
import java.util.Scanner;

public class hvhvstring_pelindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //pelindrome(s);
        System.out.println(pelindrome(s));

    }

    public static boolean pelindrome(String s) {
        String a = "";
        for (int i = 0; i < s.length() / 2+1; i++) {
            for (int j = s.length() - 1; j >= s.length() / 2; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }


        }
        return true;

    }

}


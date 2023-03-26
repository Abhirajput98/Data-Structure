import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class az {

    public static void main(String[] args) {
        System.out.println(ans("hello","ll"));
    }


    public static int ans(String haystack, String needle) {


        for (int i = 0; i < haystack.length(); i++) {
            if (i + needle.length() <= haystack.length()) {

                String s = haystack.substring(i, i + needle.length());
                i = i + needle.length() - 1;
                if (s.equals(needle)) {
                   // int k = needle.indexOf();
                    int d = haystack.indexOf(needle.charAt(0));
                    return d;

                }

            }


        }
        return  -1;

    }
}


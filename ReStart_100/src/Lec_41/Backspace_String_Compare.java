package Lec_41;


import java.util.Stack;

public class Backspace_String_Compare {
    public static void main(String[] args) {
        String s = "aaa###a", t = "aaaa###a";
        System.out.println(check(s, t));

    }

    public static boolean check(String s, String t) {

        Stack<String> s1 = new Stack<>();
        Stack<String> s2 = new Stack<>();


        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#' && !s1.isEmpty()) {
                s1.pop();
                //s2.pop();
            } else if (s.charAt(i) == '#' && s1.isEmpty()) {
                continue;

            } else {
                s1.push(String.valueOf(s.charAt(i)));

            }


            // s2.push(String.valueOf(t.charAt(i)));


        }
        for (int i = 0; i < t.length(); i++) {

            if (t.charAt(i) == '#' && !s2.isEmpty()) {
//                s1.pop();
                s2.pop();
            } else if (t.charAt(i) == '#' && s2.isEmpty()) {
                continue;
            } else {
                s2.push(String.valueOf(t.charAt(i)));
            }

//                s1.push(String.valueOf(s.charAt(i)));


        }
        System.out.println(s1);
        System.out.println(s2);

        return areStacksEqual(s1, s2);


    }

    public static boolean areStacksEqual(Stack<String> stack1, Stack<String> stack2) {
        // Check if the sizes are equal
        if (stack1.size() != stack2.size()) {
            return false;
        }

        // Compare each element of the stacks
        for (int i = 0; i < stack1.size(); i++) {
            if (!stack1.get(i).equals(stack2.get(i))) {
                return false;
            }
        }

        // Stacks are equal
        return true;


    }
}

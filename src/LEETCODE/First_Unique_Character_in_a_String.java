package LEETCODE;

public class First_Unique_Character_in_a_String {
    public static void main(String[] args) {
        String  s = "loveleetcode";
        System.out.println(firstuniq(s));

    }
    public static int firstuniq(String s){
        for(int i =0;i<s.length();i++) {
            int c = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return -1;
                }
            }
            return i;
        }
        return -1;
    }
}

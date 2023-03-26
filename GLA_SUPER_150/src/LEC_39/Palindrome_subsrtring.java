package LEC_39;

public class Palindrome_subsrtring {
    public static void main(String[] args) {
        String  s ="nitin";
        System.out.println(countSubstrings(s));



    }
    public static int countSubstrings(String s) {
        // odd
        int count=0;
        for (int axis = 0; axis < s.length(); axis++) {
            for(int orbit =0;axis-orbit>=0 && axis+orbit<s.length();orbit++ ){
                if(s.charAt(axis-orbit)!=s.charAt(axis+orbit)){
                    break;
                }
                count++;
            }

        }
        // even
        for (double axis = 0.5; axis < s.length(); axis++) {
            for(double orbit =0.5;axis-orbit>=0 && axis+orbit<s.length();orbit++ ){
                if(s.charAt((int)(axis-orbit))!=s.charAt((int)(axis+orbit))){
                    break;
                }
                count++;
            }

        }
        return count;




    }}

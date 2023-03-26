package LEETCODE;

public class Count_the_Number_of_Vowel_Strings_in_Range {
    public static void main(String[] args) {
        String []words = {"hey","aeo","mu","ooo","artro"};
        int left=1;
        int right=4;
        int c=0;
        for(int i =left;i<=right;i++){
            String s = words[i];
            if((s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u')&& (s.charAt(s.length()-1)=='a' || s.charAt(s.length()-1)=='e'||s.charAt(s.length()-1)=='i'||s.charAt(s.length()-1)=='o'||s.charAt(s.length()-1)=='u')){
                c++;
            }
        }
        System.out.println(c);
    }
}

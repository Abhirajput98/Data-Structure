package LEETCODE;

public class reverse_vowels {
    public static void main(String[] args) {
       String  s = "hello";
       int j =s.length()-1;

       for(int i =0;i<s.length();i++){
           char a = s.charAt(i);
           char b = s.charAt(j);
           if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
               int k = i;
               int m =j;
              // System.out.println(k);
               //System.out.println(m);

           }
           if(b=='a' || b=='e' || b=='i' || b=='o' || b=='u'){
               int m =j;
               // System.out.println(k);
               System.out.println(m);


           }
           j--;

       }
    }
}

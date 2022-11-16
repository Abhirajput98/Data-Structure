package LEC_21;

public class Reverse_words_String {
    public static void main(String[] args) {
        String s ="  the sky is blue";
       /* String [] s1= s.split(" ");  // converts the string into String array;
        for(int i=s1.length-1;i>=0;i--){
            System.out.print(s1[i]+" " );
        }*/
      //  System.out.println(s.trim()); // delete the spaces from start and from end;
        System.out.println(reverWords(s));

    }
    public static String reverWords(String s){
        s=s.trim();
        String ans="";
        //String [] arr = s.split(" "); // split on the basis of only one space;
        String [] arr = s.split("\s+");  // split on the basis of multiple spaces;
        for(int i =arr.length-1;i>=0;i--){
            ans=ans+arr[i]+" ";


        }

        return ans.trim();



    }
}

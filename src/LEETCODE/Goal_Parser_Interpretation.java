package LEETCODE;

public class Goal_Parser_Interpretation {
    public static void main(String[] args) {
       String command = "G()()()()(al)";
       String ans="";
       String temp="";
       for ( int i =0;i<command.length();i++){
           temp+=command.charAt(i);
           if(temp.equals("G")){
               ans+="G";
               temp="";

           }
           else  if(temp.equals("()")){
               ans+="o";
               temp="";
           } else if (temp.equals("(al)")) {
               ans+="al";
               temp="";


           }
       }
        System.out.println(ans);
    }
}

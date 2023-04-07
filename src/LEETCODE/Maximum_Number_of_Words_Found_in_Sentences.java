package LEETCODE;

public class Maximum_Number_of_Words_Found_in_Sentences {
    public static void main(String[] args) {
        String [] sentences = {"please wait", "continue to fight", "continue to win"};
        int max =0;
        for(int i =0;i<sentences.length;i++){
            String a = sentences[i];

           String [] ans = a.split(" ");
            int l = ans.length;
          max = Math.max(l,max);

        }
        System.out.println(max);
    }
}

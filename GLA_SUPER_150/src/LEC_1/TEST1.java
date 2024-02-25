package LEC_1;

public class TEST1 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String [] s2 = s.split(" ");
        String ans ="";
        for(String i : s2){
            for(int j =i.length()-1;j>=0;j--){
                ans+=i.charAt(j);
            }
            ans+=" ";
        }
        System.out.println(ans.substring(0,ans.length()-1));
   /*   int a=5;
        int b=122;
        a=12;   a's  value will be updated
        System.out.println(a); << 12*/

    /*
        int a=-5;
        int b=6;
        System.out.println(a%b); <<< -5
        positive reminder << 1

    */
        // <<>     coach increament
        // a++ = a+1 fist print then it will increase the value '' post increament
        /*
        int a=-5;
        System.out.println(a++); // <<< -5
        */
        /*
        int a =-5;
        int x=11;
        b=a++;
        int b=x--; // x = 10
        int p= 5+ a++ - x-- -a + a++;
        System.out.println(p);  << -9


         int a=5;
         int x=4;
         ++a << pre increament fist increamet then it will print
         int n = a++ + ++a - --x + --x + ++x;
        System.out.println(n);  <<<< 14

         */
















    }
}

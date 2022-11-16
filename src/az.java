import java.util.Scanner;
public class az {

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().charAt(0);
        System.out.println(ch);
        if(ch>='a'&& ch<='z'){
            System.out.println("lowercase");
        }
        else if ( ch>='a' && ch<='z'){
            System.out.println("uppercase");
        }
        else{
            System.out.println("Invalid");
        }


        }

    }

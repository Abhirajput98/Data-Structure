import java.util.Scanner;

public class NumberIsEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        int num= sc.nextInt();
        if(num%2==0){
            System.out.println("1");

        }
        else{
            System.out.println("0");
        }
    }
}

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the temprature in Fahrenheit");
        int f = sc.nextInt();
        float c = (f-32)*0.55f;
        System.out.println("the given temprature in celsius is:-");
        System.out.println(c);




    }

}
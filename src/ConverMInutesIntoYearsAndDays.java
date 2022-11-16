import java.util.Scanner;

public class ConverMInutesIntoYearsAndDays {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the minutes");
        int a= sc.nextInt();
        int years= a/525600;
        int days = (a%525600)/1440;
        System.out.println(years +"  YEARS  " + days +" DAYS ");

    }
}

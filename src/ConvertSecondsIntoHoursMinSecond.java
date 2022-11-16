import java.util.Scanner;

public class ConvertSecondsIntoHoursMinSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Seconds");
        int s = sc.nextInt();
        int hrs = s / 3600;
        int min = (s - (hrs * 3600)) / 60;
        int sec = s - ((hrs * 3600) + (min * 60));
        System.out.printf("%d : %d : %d", hrs, min, sec);
    }
}

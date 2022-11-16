import java.util.Scanner;
public class NumberOfIntegerInTheRange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE RANGE");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("Enter the value of divider");
        int p = sc.nextInt();
        int i;
        int sum=0;
        for(i=x;i<=y;i++){
            if (i%p==0){
                sum++;
            }
        }
        System.out.printf("TOTAL NUMBERS WHICH ARE DIVISBLE BY %d ARE %d :=",p,sum);
    }
}

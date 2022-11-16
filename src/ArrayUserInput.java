import java.util.Scanner;
public class ArrayUserInput{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("NUMBER OF SIZE");
        int n=sc.nextInt();
        int [] s = new int[n];
        int i;
        for (i=0;i<n;i++){
            System.out.println("enter the element");
            int ele=sc.nextInt();
            s[i]=ele;
        }
        for (i=0;i<n;i++){
            System.out.printf(" %d ",s[i]);
        }
    }
}
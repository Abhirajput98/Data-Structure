import java.util.Scanner;

public class CbseBoardExamPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the maximum marks");
        int max= sc.nextInt();
        System.out.println("enter the marks of maths");
        int m=sc.nextInt();
        System.out.println("enter the marks of english");
        int e= sc.nextInt();
        System.out.println("enter the marks of hindi");
        int h=sc.nextInt();
        System.out.println("enter the marks of science");
        int s=sc.nextInt();
        System.out.println("enter the marks of sst");
        int sst=sc.nextInt();
        float sum=m+e+h+s+sst;
        float per=(sum/(max*5))*100;
        System.out.println(per);


    }
}

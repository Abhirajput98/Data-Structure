import java.util.Scanner;
public class ArrayCheckNumberPresentOrNOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,a,s=0;
        int [] array;
        System.out.println("enter the size of the array");
        n=sc.nextInt();
        array=new int[n];
        System.out.println("enter the elements of the array");
        for (i=0;i<n;i++){
            a=sc.nextInt();
            array[i]=a;
        }
        System.out.println("enter the element your want to check");
        int c=sc.nextInt();
        for(int elements : array){
            if (elements==c){
                s=s+1;
            }
        }
        if (s==1){
            System.out.println("element is present in the array");
        }
        else{
            System.out.println("element is not present in the array");
        }

    }
}

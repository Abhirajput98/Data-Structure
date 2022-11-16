import java.util.Scanner;
 class  employee{
    int id= 0;
    String name = "  not given";
    public void details(){
        System.out.println(" your id    23456789456" +
                "is " + id);
        System.out.println(" your name is " + name);

     }
}
public class Avvi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        employee avvi = new employee();
        avvi.id = 12;
        avvi.name = "Abhisheksengar";
//      System.out.println(avvi.name);
        avvi.details();


    }
}

import java.util.Scanner;

public class ConvertInchesToMeter {
    public static void main(String[] args){
        System.out.println("enter the lenght in inches");
        Scanner sc = new Scanner(System.in);
        float inches= sc.nextFloat();
        float meters = inches*0.0254f;
        System.out.println("the lenght in meters is:-");
        System.out.println(meters + " meters");

    }
}

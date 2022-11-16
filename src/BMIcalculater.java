import java.util.Scanner;

public class BMIcalculater {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the height in inches");
        float height = sc.nextFloat();
        System.out.println("enter the weight in pounds");
        float weight = sc.nextFloat();
        float BMI=(weight*703)/(height*height);
        System.out.println("the BMI OF the person is"+ BMI);
    }
}

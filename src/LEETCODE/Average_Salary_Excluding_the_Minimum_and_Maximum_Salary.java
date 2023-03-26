package LEETCODE;

import java.util.Arrays;

public class Average_Salary_Excluding_the_Minimum_and_Maximum_Salary {
    public static void main(String[] args) {
        int []salary = {4000,3000,1000,2000};
        Arrays.sort(salary);
        double d = 0;
        for(int i =1;i<salary.length-1;i++){
            d += salary[i];

        }
        System.out.println(d/2);
    }
}

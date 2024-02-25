package ReStart_100;

import java.util.Scanner;

public class Playing_with_Matches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int a= sc.nextInt();
            int b = sc.nextInt();
            String c = Integer.toString(a+b);

            System.out.println(c);
            int sum=0;
            for(int i =0;i<c.length();i++) {
                if (c.charAt(0) == 'O') {
                    sum = 0;

                } else if (c.charAt(i) == '1') {
                    sum += 2;
                } else if (c.charAt(i) == '2') {
                    sum += 5;
                } else if (c.charAt(i) == '3') {

                    sum += 5;

                } else if (c.charAt(i) == '4') {
                    sum += 4;
                } else if (c.charAt(i) == '5') {
                    sum += 5;
                }
                else if(c.charAt(i)=='6'){
                    sum+=6;
                }
                else if(c.charAt(i)=='7'){
                    sum+=3;
                }
                else if(c.charAt(i)=='8'){
                    sum+=7;

                }
                else if(c.charAt(i)=='9'){
                    sum+=6;
                }
                else {
                    sum+=6;
                }
            }
            System.out.println(sum);
            }}

}

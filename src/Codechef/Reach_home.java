package Codechef;

import java.util.Scanner;

public class Reach_home {
    public static void main(String[] args) {
      //  Scanner sc =new Scanner(S);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            int fuel= sc.nextInt();
            int home= sc.nextInt();
            if(fuel*5>=home){
                System.out.println("yes");
            }
            else {
                System.out.println("No");
            }
        }

    }
}

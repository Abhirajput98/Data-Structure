package LEC_18;
import java.util.Scanner;

public class cb_number {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        String s= sc.next();
        //String s = "692239";
        printsubstring(s);

    }
    public static void printsubstring( String s){
        int count=0;
        boolean [] visited = new boolean[s.length()];
        for(int len =1;len<=s.length();len++){
            for(int  j= len;j<=s.length();j++){
                int i=j-len;
                String str= s.substring(i,j);
                long num = Long.parseLong(str);
                if(iscbNumber(num)==true ){
                    count++;
                    for(int k =i;k<=j-1;k++){
                        visited[k]=true;
                    }
                }


            }


        }
        System.out.println(count);


        }
    public static boolean isvisited(boolean[] visited,int i ,int j){
        for(int k=i;k<=j;k++){
            if(visited[k]==true){
                return false;

            }


        }
        return true;


    }


        public static boolean iscbNumber(long num){
        int [] arr ={2,3,5,7,11,13,17,19,23,29 };
        if(num==0 || num==1){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            if(num==arr[i]){
                return true;
            }
        }
        for (int i =0 ;i<arr.length;i++){
            if(num%arr[i]==0){
                return false;
            }
        }
        return true;
    }
}

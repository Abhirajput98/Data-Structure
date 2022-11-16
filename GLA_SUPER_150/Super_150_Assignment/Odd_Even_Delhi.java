public class Odd_Even_Delhi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k= sc.nextInt();
        int i=1;
        while(i<=k){
            int n = sc.nextInt();
            int sum=0;
            int sum1=0;

            while(n!=0){
                int a=n%10;
                if(a%2==0){
                    sum+=sum+a;
                }
                else{
                    sum1+=a;
                }
                n=n/10;


            }
            if(sum%4==0 || sum1%3==0){
                System.out.println("yes");

            }
            else{
                System.out.println("no");
            }
            i++;
        }



    }
}

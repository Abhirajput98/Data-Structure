package LEC_6;
public class Binary_to_6 {
    public static void main(String[] args) {
        int n =2;
        int sum=0;
        int mul=1;
        while(n!=0){
            int rem=n%2;
            sum=sum+rem*mul;
            n=n/2;
            mul=mul*10;

        }
        System.out.println(sum);

        int c=0,o=0;
        System.out.println(sum);
        String s = Integer.toString(sum);
        for(int i =0;i<s.length();i++){
          char a= s.charAt(i);
            //System.out.println(a);
            if(a=='1' && i%2==0){
                c++;
            }
            if(a=='1' && i%2!=0){
                o++;
            }

        }
        System.out.println(c);
        System.out.println(o);

    }
}

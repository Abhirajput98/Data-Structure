package LEC_78;

public class Set_bit {
    public static void main(String[] args) {
        int n=67;
        int pos =3;
        int mask =(1<<3);
        if((n& mask)==0){
            System.out.println("Set  nhi hain");

        }
        else{
            System.out.println("Set hai");

        }
    }
}

package LEC_78;

public class Left_Right_shift {
    public static void main(String[] args) {
        int n =5;
        System.out.println(n<<3);
        int a=-5;
        System.out.println(a<<1); // neagtinh number ke liye perle ones compliment nikatlty hai uske badd useme 1 add krderye hain

        // RIHGT shift >> piche se bit droup hoga __ aage 0 add hoga \
        int b=20;
        System.out.println(b>>1);

        int b1=-21;
        System.out.println(b1>>1);

    }
}

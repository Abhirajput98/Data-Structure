package LEETCODE;

public class Add_binary {
    public static void main(String[] args) {
        String a ="11";
        String b ="1";
        String c = "";
        int k =0;
        for(int i =Math.max(a.length(),b.length())-1;i>=0;i--){
            //System.out.println(i);
            int j =Math.min(a.length(),b.length())-1;
            if(a.charAt(i)=='1' && b.charAt(j)=='1'){
                c+=0+Integer.toString(k);
                k=1;

            }
            j--;
            System.out.println(c);

        }
    }
}

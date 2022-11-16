package LEC_17;

public class compare_to_string {
    public static void main(String[] args) {
        String s1 = "KoMal";
        String s2 ="KuMal";
        System.out.println(compareto(s1,s2));

    }
    public static int compareto(String s1,String s2){
        int i =0;
        int j =0;
        while(i<s1.length() && j<s2.length() ){
            if(s1.charAt(i)!=s2.charAt(j)){
                return s1.charAt(i)-s2.charAt(j);
            }
            i++;
            j++;
        }
        return s1.length()-s2.length(); // if negative then second is greatter
    }
}

package LEC_9;
import java.util.Arrays;

public class build_array {
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 45};
        System.out.println(Arrays.toString(buildArray(arr)));
    }


    public static int[] buildArray(int[] nums) {
        int[] k = new int[(nums.length) * 2];
        int l = nums.length;
        int a= k.length;
        int b=0;
        for(int i=0;i<2;i++){
            for (int j=0;j<l;j++){
                k[b]=nums[j];
                b++;
            }
        }
        return k;


    }
}


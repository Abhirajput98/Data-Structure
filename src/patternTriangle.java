public class patternTriangle {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

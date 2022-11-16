import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class NumbersDivisibleBy3And5 {
    public static void main(String[] args){
        int i;
        System.out.println("NUMBERS WHICH ARE DIVISIBE BY 3 ARE :-");
        for (i=1;i<=100;i++){
            if (i%3==0){
                System.out.printf("%d  ",i  );
            }
        }
        System.out.println();
        System.out.println("NUMBERS WHICH ARE DIVISIBE BY 5 ARE :-");
        for (i=1;i<=100;i++) {
            if (i % 5 == 0) {
                System.out.printf("%d  ",i  );
            }
        }
        System.out.println();
        System.out.println("NUMBERS WHICH ARE DIVISIBE BY 3 and 5 ARE :-");
        for (i=1;i<=100;i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.printf("%d " ,i   );
            }
        }

    }
}
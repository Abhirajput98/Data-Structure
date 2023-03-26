package LEC_39;
import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        chess_board(0,0,n,n,"");
        System.out.println();
        System.out.println(count);
    }

    static int count = 0;
    public static void chess_board(int cr, int cc, int er, int ec, String ans) {

        // Positive Base Case

        if (cr == er - 1 && cc == ec - 1) {

            System.out.print(ans + "{" + cr + "-" + cc + "} ");
            count++;
            return;

        }

        // Negative Base case

        if (cr >= er || cc >= ec) {

            return;

        }

        // Knight

        chess_board(cr + 2, cc + 1, er, ec, ans + "{" + cr + "-" + cc + "}K");
        chess_board(cr + 1, cc + 2, er, ec, ans + "{" + cr + "-" + cc + "}K");

        // Rook

        if (cr == 0 || cc == 0 || cr == er - 1 || cc == ec - 1) {

            for (int moves = 1; moves < ec; moves++)

                chess_board(cr, cc + moves, er, ec, ans + "{" + cr + "-" + cc + "}R");

            for (int moves = 1; moves < er; moves++)

                chess_board(cr + moves, cc, er, ec, ans + "{" + cr + "-" + cc + "}R");

        }

        // Bishop

        if (cr == cc || cr + cc == er - 1) {

            for (int moves = 1; moves < er; moves++) {

                chess_board(cr + moves, cc + moves, er, ec, ans + "{" + cr + "-" + cc + "}B");

            }

        }
    }
}

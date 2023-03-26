package LEC_38;

import java.util.Scanner;

public class NQueens {

    private int[][] board;
    private int n;

    public NQueens(int n) {
        board = new int[n][n];
        this.n = n;
    }

    public boolean solve() {
        return solve(0);
    }

    private boolean solve(int col) {
        if (col >= n) {
            return true; // All queens have been placed
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(row, col)) {
                board[row][col] = 1;
                if (solve(col + 1)) {
                    return true;
                }
                board[row][col] = 0;
            }
        }
        return false; // Backtrack
    }

    private boolean isSafe(int row, int col) {
        // Check if there is a queen in the same row
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        // Check if there is a queen in the upper diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check if there is a queen in the lower diagonal
        for (int i = row, j = col; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public void printSolution() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int N = obj.nextInt();
        NQueens queens = new NQueens(N);
        if (queens.solve()) {
            queens.printSolution();
        } else {
            System.out.println("No solution found");
        }
    }
}


package Array;

import java.util.Scanner;

public class NQueens {

    static int solutionCount = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        int n = sc.nextInt();

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        solve(board, 0);

        System.out.println("Total Solutions = " + solutionCount);
    }

    static void solve(char[][] board, int row) {

        int n = board.length;

        if (row == n) {
            solutionCount++;

            System.out.println("\nSolution " + solutionCount + ":");

            printBoard(board);

            return;
        }

        for (int col = 0; col < n; col++) {

            if (isSafe(board, row, col)) {

                board[row][col] = 'Q';

                solve(board, row + 1);

                board[row][col] = '.';
            }
        }
    }

    static boolean isSafe(char[][] board, int row, int col) {

        int n = board.length;

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < n;
             i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static void printBoard(char[][] board) {

        for (char[] row : board) {

            for (char cell : row) {
                System.out.print(cell + " ");
            }

            System.out.println();
        }
    }
}
/**
 * TicTacToeUC1.java
 * 
 * UC1: Display an empty Tic-Tac-Toe board.
 * Uses 2D array, initialization, and nested loops.
 */

public class TicTacToeUC1 {

    public static void main(String[] args) {

        // Step 1: Create board (3x3)
        char[][] board = new char[3][3];

        // Step 2: Initialize board with '-'
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }

        // Step 3: Display board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(); // next line after each row
        }
    }
}
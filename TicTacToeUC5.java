import java.util.Scanner;

/**
 * TicTacToeUC5.java
 *
 * UC5: Validate move (bounds + empty cell)
 */

public class TicTacToeUC5 {

    // Create board
    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    // Convert slot → row & col
    public static int[] convertSlot(int slot) {
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;
        return new int[]{row, col};
    }

    // Validate move
    public static boolean isValidMove(int row, int col) {

        // Boundary check
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }

    // Display board
    public static void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        displayBoard();

        System.out.print("Enter slot (1-9): ");
        int slot = sc.nextInt();

        int[] pos = convertSlot(slot);
        int row = pos[0];
        int col = pos[1];

        if (isValidMove(row, col)) {
            System.out.println("Valid move ✅");
        } else {
            System.out.println("Invalid move ❌");
        }
    }
}
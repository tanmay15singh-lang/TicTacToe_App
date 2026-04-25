import java.util.Scanner;

/**
 * TicTacToeUC6.java
 *
 * UC6: Update board with player's symbol
 */

public class TicTacToeUC6 {

    // Board
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
        return row >= 0 && row < 3 &&
               col >= 0 && col < 3 &&
               board[row][col] == '-';
    }

    // ✅ NEW METHOD (UC6)
    public static void updateBoard(int row, int col, char symbol) {
        board[row][col] = symbol;
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

        char symbol = 'X'; // for now fixed (next UC will handle switching)

        if (isValidMove(row, col)) {
            updateBoard(row, col, symbol);
            System.out.println("Board updated ✅");
        } else {
            System.out.println("Invalid move ❌");
        }

        displayBoard();
    }
}
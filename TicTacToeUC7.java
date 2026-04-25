import java.util.Random;

/**
 * TicTacToeUC7.java
 *
 * UC7: Computer makes a random valid move
 */

public class TicTacToeUC7 {

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

    // Update board
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

    // ✅ UC7: Computer move
    public static void computerMove(char symbol) {

        Random random = new Random();

        while (true) {

            int slot = random.nextInt(9) + 1; // 1–9

            int[] pos = convertSlot(slot);
            int row = pos[0];
            int col = pos[1];

            if (isValidMove(row, col)) {
                updateBoard(row, col, symbol);
                System.out.println("Computer chose slot: " + slot);
                break;
            }
        }
    }

    public static void main(String[] args) {

        displayBoard();

        char computerSymbol = 'O';

        computerMove(computerSymbol);

        System.out.println("Board after computer move:");
        displayBoard();
    }
}
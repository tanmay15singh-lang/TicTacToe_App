import java.util.Scanner;
import java.util.Random;

/**
 * TicTacToeUC8.java
 *
 * UC8: Game loop with turn switching + win/draw detection
 */

public class TicTacToeUC8 {

    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    // Display board
    public static void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Convert slot → row/col
    public static int[] convertSlot(int slot) {
        return new int[]{(slot - 1) / 3, (slot - 1) % 3};
    }

    // Validate move
    public static boolean isValidMove(int r, int c) {
        return r >= 0 && r < 3 && c >= 0 && c < 3 && board[r][c] == '-';
    }

    // Update board
    public static void updateBoard(int r, int c, char symbol) {
        board[r][c] = symbol;
    }

    // Player move
    public static void playerMove(char symbol) {
        while (true) {
            System.out.print("Enter slot (1-9): ");
            int slot = sc.nextInt();

            int[] pos = convertSlot(slot);

            if (isValidMove(pos[0], pos[1])) {
                updateBoard(pos[0], pos[1], symbol);
                break;
            } else {
                System.out.println("Invalid move, try again.");
            }
        }
    }

    // Computer move
    public static void computerMove(char symbol) {
        while (true) {
            int slot = random.nextInt(9) + 1;
            int[] pos = convertSlot(slot);

            if (isValidMove(pos[0], pos[1])) {
                updateBoard(pos[0], pos[1], symbol);
                System.out.println("Computer chose: " + slot);
                break;
            }
        }
    }

    // Check winner
    public static boolean checkWin(char s) {

        for (int i = 0; i < 3; i++) {
            if (board[i][0] == s && board[i][1] == s && board[i][2] == s) return true;
            if (board[0][i] == s && board[1][i] == s && board[2][i] == s) return true;
        }

        if (board[0][0] == s && board[1][1] == s && board[2][2] == s) return true;
        if (board[0][2] == s && board[1][1] == s && board[2][0] == s) return true;

        return false;
    }

    // Check draw
    public static boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        char player = 'X';
        char computer = 'O';

        boolean gameOver = false;

        displayBoard();

        while (!gameOver) {

            // Player turn
            playerMove(player);
            displayBoard();

            if (checkWin(player)) {
                System.out.println("Player wins 🎉");
                break;
            }

            if (isDraw()) {
                System.out.println("It's a draw 🤝");
                break;
            }

            // Computer turn
            computerMove(computer);
            displayBoard();

            if (checkWin(computer)) {
                System.out.println("Computer wins 🤖");
                break;
            }

            if (isDraw()) {
                System.out.println("It's a draw 🤝");
                break;
            }
        }
    }
}
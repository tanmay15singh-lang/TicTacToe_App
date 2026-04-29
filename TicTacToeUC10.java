public class TicTacToeUC10 {

    static char[][] board = {
            {'X', 'O', 'X'},
            {'X', 'O', 'O'},
            {'O', 'X', 'X'}
    };

    // Display board
    public static void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // UC10: Check draw
    public static boolean isDraw() {

        // Traverse board
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                // If any empty cell found → not draw
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }

        // No empty cells → draw
        return true;
    }

    public static void main(String[] args) {

        displayBoard();

        if (isDraw()) {
            System.out.println("Game is a draw 🤝");
        } else {
            System.out.println("Moves still remaining");
        }
    }
}
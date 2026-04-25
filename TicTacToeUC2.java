import java.util.Random;

/**
 * TicTacToeUC2.java
 *
 * UC2: Randomly decide which player starts
 * and assign symbols (X / O)
 */

public class TicTacToeUC2 {

    public static void main(String[] args) {

        Random random = new Random();

        // Toss: 0 or 1
        int toss = random.nextInt(2);

        String player1 = "Player 1";
        String player2 = "Player 2";

        char player1Symbol;
        char player2Symbol;
        String currentPlayer;

        if (toss == 0) {
            // Player 1 starts
            player1Symbol = 'X';
            player2Symbol = 'O';
            currentPlayer = player1;
        } else {
            // Player 2 starts
            player2Symbol = 'X';
            player1Symbol = 'O';
            currentPlayer = player2;
        }

        // Display result
        System.out.println("Toss Result:");
        System.out.println(currentPlayer + " will start first!");

        System.out.println(player1 + " symbol: " + player1Symbol);
        System.out.println(player2 + " symbol: " + player2Symbol);
    }
}
import java.util.Scanner;

/**
 * TicTacToeUC3.java
 *
 * UC3: Take user input (slot number 1–9)
 * and return it to game logic.
 */

public class TicTacToeUC3 {

    // Method to take input
    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter slot number (1-9): ");
        int slot = sc.nextInt();

        return slot;
    }

    public static void main(String[] args) {

        int slot = getUserInput();

        System.out.println("You selected slot: " + slot);
    }
}
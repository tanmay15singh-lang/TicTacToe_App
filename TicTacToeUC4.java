import java.util.Scanner;

/**
 * TicTacToeUC4.java
 *
 * UC4: Convert slot (1–9) into row and column indices
 */

public class TicTacToeUC4 {

    // Method to take input
    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        int slot;

        while (true) {
            System.out.print("Enter slot (1-9): ");
            slot = sc.nextInt();

            if (slot >= 1 && slot <= 9) {
                return slot;
            } else {
                System.out.println("Invalid input. Try again.");
            }
        }
    }

    // Method to convert slot → row & column
    public static int[] convertSlot(int slot) {

        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        return new int[]{row, col};
    }

    public static void main(String[] args) {

        int slot = getUserInput();

        int[] position = convertSlot(slot);

        System.out.println("Row: " + position[0]);
        System.out.println("Column: " + position[1]);
    }
}
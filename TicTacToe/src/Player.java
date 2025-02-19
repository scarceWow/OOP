import java.util.Scanner;

public class Player {
    public char symbol;
    public Scanner scanner;

    public Player(char symbol) {
        this.symbol = symbol;
        scanner = new Scanner(System.in);
    }

    public char getSymbol() {
        return symbol;
    }

    public int[] getMove() {
        int row, col;
        while (true) {
            System.out.println("Player " + symbol + ", enter your move (row and column: 0, 1, or 2): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            if (row >= 0 && row < 3 && col >= 0 && col < 3) {
                return new int[]{row, col};
            }
            System.out.println("Invalid input. Try again.");
        }
    }
}


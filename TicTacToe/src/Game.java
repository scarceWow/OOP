import java.util.Scanner;

public class Game {
    public Board board;
    public Player playerX;
    public Player playerO;
    public Player currentPlayer;

    public Game() {
        board = new Board();
        playerX = new Player('X');
        playerO = new Player('O');
        currentPlayer = playerX;
    }

    public void start() {
        while (true) {
            board.printBoard();
            int[] move = currentPlayer.getMove();
            
            if (!board.makeMove(move[0], move[1], currentPlayer.getSymbol())) {
                System.out.println("This move is not valid. Try again.");
                continue;
            }
            
            if (board.checkWin(currentPlayer.getSymbol())) {
                board.printBoard();
                System.out.println("Player " + currentPlayer.getSymbol() + " wins!");
                break;
            }
            
            if (board.isFull()) {
                board.printBoard();
                System.out.println("It's a draw!");
                break;
            }
            
            currentPlayer = (currentPlayer == playerX) ? playerO : playerX;
        }
    }
}

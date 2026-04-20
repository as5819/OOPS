import java.util.Random;

public class Main {
    public static void main(String[] args) {
        char[] playerSymbols = new char[2];
        int currentPlayer;

        Random random = new Random();
        int toss = random.nextInt(2);

        if (toss == 0) {
            currentPlayer = 1;
            playerSymbols[0] = 'X';
            playerSymbols[1] = 'O';
        } else {
            currentPlayer = 2;
            playerSymbols[1] = 'X';
            playerSymbols[0] = 'O';
        }

        System.out.println("Player 1 Symbol: " + playerSymbols[0]);
        System.out.println("Player 2 Symbol: " + playerSymbols[1]);
        System.out.println("Player " + currentPlayer + " starts the game!");
    }
}
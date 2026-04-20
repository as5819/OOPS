import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    static int getPlayerInput() {
        System.out.print("Enter slot number (1-9): ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int slot = getPlayerInput();
        System.out.println("You entered: " + slot);
    }
}

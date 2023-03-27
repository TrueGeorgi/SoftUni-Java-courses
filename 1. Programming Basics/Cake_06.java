import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int widthCake = Integer.parseInt(scanner.nextLine());
        int lenghtCake = Integer.parseInt(scanner.nextLine());
        int cakePieces = widthCake * lenghtCake;
        String input = scanner.nextLine();
        while (!input.equals("STOP")) {
            int inputNumbers = Integer.parseInt(input);
            cakePieces -= inputNumbers;
            if (cakePieces <=0) {
                break;
            }
            input = scanner.nextLine();
        }
        int neededPieces = -cakePieces;
        if (cakePieces > 0) {
            System.out.printf("%d pieces are left.",cakePieces);
        } else {
            int piecesNeeded = -cakePieces;
            System.out.printf("No more cake left! You need %d pieces more.", piecesNeeded);
        }
    }
}

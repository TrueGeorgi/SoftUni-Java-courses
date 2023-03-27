import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String favoriteBook = scanner.nextLine();
        String books = scanner.nextLine();
        int counter = 0;
        boolean found = false;
        while (!books.equals("No More Books")) {
            if (books.equals(favoriteBook)) {
                System.out.printf("You checked %d books and found it.",counter);
                found = true;
                break;
            }
            counter++;
            books = scanner.nextLine();
        }
        if (!found) {
            System.out.printf("The book you search is not here!%n");
            System.out.printf("You checked %d books.", counter);
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class A02_BookWorm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        StringBuilder outputBuilder = new StringBuilder(string);

        int fieldSize = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[fieldSize][fieldSize];

        int characterRow = -1;
        int characterColumn = -1;

        for (int i = 0; i < fieldSize; i++) {
            String rowN = scanner.nextLine();
            for (int j = 0; j < fieldSize; j++) {
                field[i][j] = rowN.charAt(j);
                if (rowN.charAt(j) == 'P') {
                    characterRow = i;
                    characterColumn = j;
                }
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            switch (command) {
                case "up":
                    int newRow = characterRow - 1;
                    if (newRow < 0) {
                        if (!outputBuilder.isEmpty()) {
                            outputBuilder.deleteCharAt(outputBuilder.length() - 1);
                        }
                    } else {
                        char symbolAtPosition = field[newRow][characterColumn];
                        if (symbolAtPosition != '-') {
                            outputBuilder.append(symbolAtPosition);
                        }
                        field[newRow][characterColumn] = 'P';
                        field[characterRow][characterColumn] = '-';
                        characterRow = newRow;
                    }
                    break;
                case "right":
                    int newColumn = characterColumn + 1;
                    if (newColumn >= fieldSize) {
                        if (!outputBuilder.isEmpty()) {
                            outputBuilder.deleteCharAt(outputBuilder.length() - 1);
                        }
                    } else {
                        char symbolAtPosition = field[characterRow][newColumn];
                        if (symbolAtPosition != '-') {
                            outputBuilder.append(symbolAtPosition);
                        }
                        field[characterRow][newColumn] = 'P';
                        field[characterRow][characterColumn] = '-';
                        characterColumn = newColumn;
                    }
                    break;
                case "down":
                    newRow = characterRow + 1;
                    if (newRow >= fieldSize) {
                        if (!outputBuilder.isEmpty()) {
                            outputBuilder.deleteCharAt(outputBuilder.length() - 1);
                        }
                    } else {
                        char symbolAtPosition = field[newRow][characterColumn];
                        if (symbolAtPosition != '-') {
                            outputBuilder.append(symbolAtPosition);
                        }
                        field[newRow][characterColumn] = 'P';
                        field[characterRow][characterColumn] = '-';
                        characterRow = newRow;
                    }
                    break;
                case "left":
                     newColumn = characterColumn - 1;
                    if (newColumn < 0) {
                        if (!outputBuilder.isEmpty()) {
                            outputBuilder.deleteCharAt(outputBuilder.length() - 1);
                        }
                    } else {
                        char symbolAtPosition = field[characterRow][newColumn];
                        if (symbolAtPosition != '-') {
                            outputBuilder.append(symbolAtPosition);
                        }
                        field[characterRow][newColumn] = 'P';
                        field[characterRow][characterColumn] = '-';
                        characterColumn = newColumn;
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        String output = String.valueOf(outputBuilder);
        System.out.println(output);
        for (int i = 0; i < fieldSize; i++) {
            for (int j = 0; j < fieldSize; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }
}

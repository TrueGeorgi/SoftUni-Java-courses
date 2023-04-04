import java.util.Arrays;
import java.util.Scanner;

public class AE06_LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] beginIndexLadybugs = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] field = new int[fieldSize];
        for (int i = 0; i < field.length; i++) {
            boolean bug = false;
            for (int currentLadyBugIndex : beginIndexLadybugs) {
                if (i == currentLadyBugIndex) {
                    bug = true;
                    field[i] = 1;
                }
            }
            if (!bug) {
                field[i] = 0;
            }
        }
        String command = scanner.nextLine();

        while (!command.equals("end")) {

            int startingIndex = Integer.parseInt(command.split("\\s+")[0]);

            int moveSpaces = Integer.parseInt(command.split("\\s+")[2]);

            String direction = command.split("\\s+")[1];

            if (moveSpaces < 0 && direction.equals("right")) {
                moveSpaces *= -1;
                direction = "left";
            } else  if (moveSpaces < 0 && direction.equals("left")) {
                moveSpaces *= -1;
                direction = "right";
            }

            int newIndex = 0;

            if (direction.equals("right")) {
                newIndex = startingIndex + moveSpaces;
            } else {
                newIndex = startingIndex - moveSpaces;
            }

            if (startingIndex < 0 || startingIndex > fieldSize - 1 || newIndex < 0 || newIndex > fieldSize - 1) {
                if (startingIndex >= 0 && startingIndex < fieldSize) {
                    field[startingIndex] = 0;
                }

                command = scanner.nextLine();
                continue;
            }

            if (field[startingIndex] == 0) {
                command = scanner.nextLine();
                continue;
            }

            field[startingIndex] = 0;

            boolean outside = false;

            while (field[newIndex] != 0) {
                if (direction.equals("right")) {
                    newIndex += moveSpaces;
                    if (newIndex > fieldSize - 1) {
                        newIndex -= moveSpaces;
                        outside = true;
                        break;
                    }
                } else {
                    newIndex -= moveSpaces;
                    if (newIndex < 0) {
                        newIndex += moveSpaces;
                        outside = true;
                        break;
                    }
                }
            }

            if (!outside) {
                field[newIndex] = 1;
            }


            command = scanner.nextLine();
        }
        for (int space : field) {
            System.out.print(space + " ");
        }
    }
}

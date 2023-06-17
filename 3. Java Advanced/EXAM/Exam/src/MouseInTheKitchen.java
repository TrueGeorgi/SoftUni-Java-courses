import java.util.Arrays;
import java.util.Scanner;

public class MouseInTheKitchen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputSize = Arrays.stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = inputSize[0];
        int columns = inputSize[1];

        char[][] cupboard = new char[rows][columns];

        int mousePositionRow = -1;
        int mousePositionColumn = -1;
        int amountOfCheese = 0;

        for (int i = 0; i < rows; i++) {
            String rowInput = scanner.nextLine();
            for (int j = 0; j < columns; j++) {
                char currentChar = rowInput.charAt(j);
                cupboard[i][j] = currentChar;
                if (currentChar == 'M') {
                    mousePositionRow = i;
                    mousePositionColumn = j;
                } else if (currentChar == 'C') {
                    amountOfCheese++;
                }
            }
        }

        String command = scanner.nextLine();

        boolean steppedOutside = false;
        boolean isTrapped = false;

        while (!command.equals("danger") && !steppedOutside && !isTrapped && amountOfCheese > 0) {
            switch (command) {
                case "up":
                    int newRow = mousePositionRow - 1; //done
                    if (newRow >= 0) { //done
                        if (cupboard[newRow][mousePositionColumn] != '@') { //done
                            cupboard[mousePositionRow][mousePositionColumn] = '*';
                            if (cupboard[newRow][mousePositionColumn] != 'T') {
                                if (cupboard[newRow][mousePositionColumn] == 'C') { // done
                                    amountOfCheese--;
                                    cupboard[newRow][mousePositionColumn] = 'M';
                                    mousePositionRow = newRow;
                                } else {
                                    cupboard[newRow][mousePositionColumn] = 'M';
                                    mousePositionRow = newRow;
                                }
                            } else { // done
                                isTrapped = true;
                                cupboard[newRow][mousePositionColumn] = 'M';
                                mousePositionRow = newRow;
                            } // done
                        } // done
                    } else { // done
                        steppedOutside = true; // done
                    } //done
                    break;
                case "right":
                    int newColumn = mousePositionColumn + 1;
                    if (newColumn < columns) {
                        if (cupboard[mousePositionRow][newColumn] != '@') {
                            cupboard[mousePositionRow][mousePositionColumn] = '*';
                            if (cupboard[mousePositionRow][newColumn] != 'T') {
                                if (cupboard[mousePositionRow][newColumn] == 'C') {
                                    amountOfCheese--;
                                    cupboard[mousePositionRow][newColumn] = 'M';
                                    mousePositionColumn = newColumn;
                                } else {
                                    cupboard[mousePositionRow][newColumn] = 'M';
                                    mousePositionColumn = newColumn;
                                }
                            } else {
                                isTrapped = true;
                                cupboard[mousePositionRow][newColumn] = 'M';
                                mousePositionColumn = newColumn;
                            }
                        }
                    } else {
                        steppedOutside = true;
                    }
                    break;
                case "down":
                    newRow = mousePositionRow + 1;
                    if (newRow < rows) {
                        if (cupboard[newRow][mousePositionColumn] != '@') {
                            cupboard[mousePositionRow][mousePositionColumn] = '*';
                            if (cupboard[newRow][mousePositionColumn] != 'T') {
                                if (cupboard[newRow][mousePositionColumn] == 'C') {
                                    amountOfCheese--;
                                    cupboard[newRow][mousePositionColumn] = 'M';
                                    mousePositionRow = newRow;
                                } else {
                                    cupboard[newRow][mousePositionColumn] = 'M';
                                    mousePositionRow = newRow;
                                }
                            } else {
                                isTrapped = true;
                                cupboard[newRow][mousePositionColumn] = 'M';
                                mousePositionRow = newRow;
                            }
                        }
                    } else {
                        steppedOutside = true;
                    }
                    break;
                case "left":
                    newColumn = mousePositionColumn - 1;
                    if (newColumn >= 0) {
                        if (cupboard[mousePositionRow][newColumn] != '@') {
                            cupboard[mousePositionRow][mousePositionColumn] = '*';
                            if (cupboard[mousePositionRow][newColumn] != 'T') {
                                if (cupboard[mousePositionRow][newColumn] == 'C') {
                                    amountOfCheese--;
                                    cupboard[mousePositionRow][newColumn] = 'M';
                                    mousePositionColumn = newColumn;
                                } else {
                                    cupboard[mousePositionRow][newColumn] = 'M';
                                    mousePositionColumn = newColumn;
                                }
                            } else {
                                isTrapped = true;
                                cupboard[mousePositionRow][newColumn] = 'M';
                                mousePositionColumn = newColumn;
                            }
                        }
                    } else {
                        steppedOutside = true;
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        if (steppedOutside) {
            System.out.println("No more cheese for tonight!");
        }

        if (amountOfCheese == 0) {
            System.out.println("Happy mouse! All the cheese is eaten, good night!");
        }

        if (isTrapped) {
            System.out.println("Mouse is trapped!");
        }

        if (command.equals("danger")) {
            System.out.println("Mouse will come back later!");
        }

        cupboard[mousePositionRow][mousePositionColumn] = 'M';

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(cupboard[i][j]);
            }
            System.out.println();
        }
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class A10_TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String loot = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Yohoho!")) {
            String[] lootArray = loot.split("\\|");
            String[] commandArray = command.split(" ");

            switch (commandArray[0]) {
                case "Loot":
                    for (int i = 1; i < commandArray.length; i++) {
                        boolean exist = false;
                        for (int j = 0; j < lootArray.length; j++) {
                            if (commandArray[i].equals(lootArray[j])) {
                                exist = true;
                                break;
                            }
                        }
                        if (!exist) {
                            loot = commandArray[i] + "|" + loot;
                        }
                    }
                    break;
                case "Drop":
                    if (Integer.parseInt(commandArray[1]) <= lootArray.length - 1
                            && Integer.parseInt(commandArray[1]) >= 0) {
                        int index = Integer.parseInt(commandArray[1]);
                        String saved = lootArray[index];
                        for (int i = index; i < lootArray.length - 1; i++) {
                            lootArray[i] = lootArray[i + 1];
                        }
                        lootArray[lootArray.length - 1] = saved;
                    }
                    loot = String.join("|", lootArray);
                    break;
                case "Steal":
                    int count = Integer.parseInt(commandArray[1]);
                    String stolenItems = "";

                    if (count <= lootArray.length && count >= 0) {
                        for (int i = count; i > 0; i--) {
                            if (i == count) {
                                stolenItems += lootArray[lootArray.length - i];
                            } else {
                                stolenItems = stolenItems + ", " + lootArray[lootArray.length - i];
                            }
                            lootArray[lootArray.length - i] = "";
                        }
                        loot = String.join("|", lootArray);
                    } else {
                        loot = "";
                        for (int i = 0; i < lootArray.length; i++) {
                            if (i == 0) {
                                stolenItems = lootArray[i];
                            } else {
                                stolenItems = stolenItems + ", " + lootArray[i];
                            }
                        }
                    }
                    System.out.println(stolenItems);
                    break;
            }

            command = scanner.nextLine();
        }
        if (loot.length() > 0) {
            char check = loot.charAt(0);
            if ((check >= 65 && check <= 90) || (check >= 97 && check <= 122)) {
                String[] finalLoot = loot.split("\\|+");
                int sumLength = 0;

                for (int i = 0; i < finalLoot.length; i++) {
                    sumLength += finalLoot[i].length();
                }
                double averageGain = sumLength * 1.0 / finalLoot.length;
                System.out.printf("Average treasure gain: %.2f pirate credits.", averageGain);
            } else {
                System.out.print("Failed treasure hunt.");
            }
        } else {
            System.out.print("Failed treasure hunt.");
        }
    }
}

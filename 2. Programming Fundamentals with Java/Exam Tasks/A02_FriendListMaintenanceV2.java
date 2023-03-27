import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A02_FriendListMaintenanceV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> friends = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        int blacklisted = 0;
        int lost = 0;

        while (!command.equals("Report")) {
            String[] input = command.split(" ");

            switch (input[0]) {
                case "Blacklist":
                    String name = input[1];
                    if (friends.contains(name)) {
                        int nameIndex = friends.indexOf(name);
                        friends.set(nameIndex, "Blacklisted");
                        blacklisted++;
                        System.out.printf("%s was blacklisted.%n", name);
                    } else {
                        System.out.printf("%s was not found.%n", name);
                    }
                    break;
                case "Error":
                    int index = Integer.parseInt(input[1]);
                    if (index >= 0 && index < friends.size()) {
                        name = friends.get(index);
                        if (!name.contains("Blacklisted")
                                && !name.contains("Lost")) {
                            friends.set(index, "Lost");
                            lost++;
                            System.out.printf("%s was lost due to an error.%n", name);
                        }
                    }
                    break;
                case "Change":
                    index = Integer.parseInt(input[1]);
                    String newName = input[2];
                    if (index < friends.size()
                            && index >= 0) {
                        name = friends.get(index);
                            friends.set(index, newName);
                            System.out.printf("%s changed his username to %s.%n", name, newName);
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.printf("Blacklisted names: %d%n", blacklisted);
        System.out.printf("Lost names: %d%n", lost);
        for (int i = 0; i < friends.size(); i++) {
            System.out.print(friends.get(i) + " ");
        }
    }
}

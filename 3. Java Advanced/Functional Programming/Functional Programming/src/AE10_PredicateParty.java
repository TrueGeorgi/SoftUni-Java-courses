import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AE10_PredicateParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> namesList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        BiPredicate<Integer, Integer> equalsLength = Objects::equals;

        while (!command.equals("Party!")) {

            String action = command.split("\\s+")[0];
            String position = command.split("\\s+")[1];
            switch (action) {
                case "Remove":
                    switch (position) {
                        case "StartsWith":
                            String partOfTheName = command.split("\\s+")[2];
                            namesList.removeIf(name -> name.startsWith(partOfTheName));
                            break;
                        case "EndsWith":
                            partOfTheName = command.split("\\s+")[2];
                            namesList.removeIf(name -> name.startsWith(partOfTheName, name.length() - partOfTheName.length()));
                            break;
                        case "Length":
                            int length = Integer.parseInt(command.split("\\s+")[2]);
                            namesList.removeIf(name -> name.length() == length);
                            break;
                    }
                    break;
                case "Double":
                    switch (position) {
                        case "StartsWith":
                            String partOfTheName = command.split("\\s+")[2];
                            for (int i = 0; i < namesList.size(); i++) {
                                if (namesList.get(i).startsWith(partOfTheName)) {
                                    namesList.add(0, namesList.get(i));
                                    i++;
                                }
                            }
                            break;
                        case "EndsWith":
                            partOfTheName = command.split("\\s+")[2];
                            for (int i = 0; i < namesList.size(); i++) {
                                if (namesList.get(i).startsWith(partOfTheName,namesList.get(i).length() - partOfTheName.length())) {
                                    namesList.add(0, namesList.get(i));
                                    i++;
                                }
                            }
                            break;
                        case "Length":
                            int length = Integer.parseInt(command.split("\\s+")[2]);
                            for (int i = 0; i < namesList.size(); i++) {
                                if (equalsLength.test(namesList.get(i).length(), length)) {
                                    namesList.add(0, namesList.get(i));
                                    i++;
                                }
                            }
                            break;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        if (namesList.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            String result = String.join(", ", namesList);
            System.out.println(result + " are going to the party!");
        }
    }
}

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class A03_ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> composers = new LinkedHashMap<>();
        Map<String, String> keys = new LinkedHashMap<>();
        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            String piece = input.split("\\|")[0];
            String composer = input.split("\\|")[1];
            String key = input.split("\\|")[2];
            composers.put(piece, composer);
            keys.put(piece, key);
        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String action = command.split("\\|")[0];
            String piece = command.split("\\|")[1];
            switch (action) {
                case "Add":
                    String newComposer = command.split("\\|")[2];
                    String newKey = command.split("\\|")[3];
                    if (composers.containsKey(piece)) {
                        System.out.println(piece + " is already in the collection!");
                    } else {
                        composers.put(piece, newComposer);
                        keys.put(piece, newKey);
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, newComposer, newKey);
                    }
                    break;
                case "Remove":
                    if (composers.containsKey(piece)) {
                        composers.remove(piece);
                        keys.remove(piece);
                        System.out.printf("Successfully removed %s!%n", piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
                case "ChangeKey":
                    String changeKey = command.split("\\|")[2];
                    if (keys.containsKey(piece)) {
                        keys.put(piece, changeKey);
                        System.out.printf("Changed the key of %s to %s!%n", piece, changeKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, String> entry : composers.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n", entry.getKey(), entry.getValue(), keys.get(entry.getKey()));
        }
    }
}

import java.util.*;

public class AE1_EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int times = Integer.parseInt(scanner.nextLine());

        String[] names = new String[times];
        Map<Integer, String> numbers = new TreeMap<>();

        for (int i = 0; i < times; i++) {
            names[i] = scanner.nextLine();
        }
        for (String name : names) {
            int sum = 0;
            for (int i = 0; i < name.length(); i++) {
                char currentLetter = name.charAt(i);
                switch (currentLetter) {
                    case 'a':
                    case 'e':
                    case 'o':
                    case 'u':
                    case 'i':
                    case 'A':
                    case 'E':
                    case 'O':
                    case 'U':
                    case 'I':
                        sum = sum + (currentLetter * name.length());
                        break;
                    default:
                        sum = sum + (currentLetter / name.length());
                }
            }
            numbers.put(sum, name);
        }
        numbers.entrySet().forEach(n -> System.out.println(n.getKey()));
    }
}

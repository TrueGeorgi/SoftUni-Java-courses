import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A05_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String bombString = scanner.nextLine();

        int bomb = Integer.parseInt(bombString.split(" ")[0]);
        int power = Integer.parseInt(bombString.split(" ")[1]);

        for (int i = 0; i < numbers.size(); i++) {
            if (bomb == numbers.get(i)) {
                if (power <= i) {
                    int indexToBeRemoved = i - power;
                    for (int j = 1; j <= power ; j++) {
                        numbers.remove(indexToBeRemoved);
                    }
                    i -= power;
                } else {
                    for (int j = 0; j < i; j++) {
                        if (i != 0) {
                            numbers.remove(0);
                        }
                    }
                    i = 0;
                }
                if (power <= numbers.size() - 1 - i) {
                    for (int j = 1; j <= power ; j++) {
                     numbers.remove(i+1);
                    }
                } else {
                    int length = numbers.size() - 1 - i;
                    for (int j = 1; j <= length ; j++) {
                        numbers.remove(i+1);
                    }
                }
                numbers.remove(i);
                 i -= 1;
            }
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}

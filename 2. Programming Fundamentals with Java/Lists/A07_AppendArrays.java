import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A07_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> arraysString = Arrays
                .stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());

      Collections.reverse(arraysString);

      String output = arraysString
              .toString()
              .replaceAll("[\\]\\[,]", "")
              .replaceAll("\\s+", " ");

        System.out.println(output);

    }
}

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class A06_StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Double> notes = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {
            String currentStudent = scanner.nextLine();
            double currentNote = Double.parseDouble(scanner.nextLine());

            if (!notes.containsKey(currentStudent)) {
                notes.put(currentStudent, currentNote);
            } else {
                double note = (notes.get(currentStudent) + currentNote) / 2;
                notes.put(currentStudent, note);
            }
        }
        notes.entrySet().stream().filter(note -> note.getValue() >= 4.5)
                .forEach(student -> System.out.printf("%s -> %.2f%n", student.getKey(), student.getValue()));
    }
}

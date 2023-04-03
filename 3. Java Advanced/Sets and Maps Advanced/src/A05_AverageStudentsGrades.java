import java.util.*;

public class A05_AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studentsGrades = new TreeMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String student = input.split("\\s+")[0];
            double grade = Double.parseDouble(input.split("\\s+")[1]);
            if (!studentsGrades.containsKey(student)) {
                studentsGrades.put(student, new ArrayList<>());
            }
            List<Double> grades = studentsGrades.get(student);
            grades.add(grade);
        }
        for (var entry : studentsGrades.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            double sumNote = 0;
            for (double note : entry.getValue()) {
                sumNote += note;
                System.out.printf("%.2f ", note);
            }
            double averageNote = sumNote / entry.getValue().size();
            System.out.printf("(avg: %.2f)%n", averageNote);
        }
    }
}

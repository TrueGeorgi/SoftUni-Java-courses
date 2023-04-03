import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class A08_AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> studentsAvrg = new TreeMap<>();

        for (int i = 1; i <= n; i++) {
            String student = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();

            double totalSumGrades = 0;

            for (double grade : grades) {
                totalSumGrades += grade;
            }

            double averageGrade = totalSumGrades / grades.length;

            DecimalFormat format = new DecimalFormat("0.####################################");

            String averageString = String.format(String.valueOf(averageGrade));

            studentsAvrg.put(student, averageString);
        }
        for (var entry : studentsAvrg.entrySet()) {
            System.out.printf("%s is graduated with %s%n", entry.getKey(), entry.getValue());
        }
    }
}

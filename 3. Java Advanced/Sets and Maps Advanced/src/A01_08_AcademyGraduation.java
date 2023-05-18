import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class A01_08_AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int spins = Integer.parseInt(scanner.nextLine());

        Map<String, double[]> students = new TreeMap<>();

        for (int i = 0; i < spins; i++) {
            String student = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble)
                    .toArray();
            students.put(student, grades);
        }
        DecimalFormat decimalFormat = new DecimalFormat("###.################");
        for (Map.Entry<String, double[]> entry : students.entrySet()) {
            double totalGrade = 0;
            for (int i = 0; i < entry.getValue().length; i++) {
                totalGrade +=  entry.getValue()[i];
            }
            double averageGrade = totalGrade / entry.getValue().length;
            System.out.printf("%s is graduated with %s%n", entry.getKey(), decimalFormat.format(averageGrade));
        }
    }
}

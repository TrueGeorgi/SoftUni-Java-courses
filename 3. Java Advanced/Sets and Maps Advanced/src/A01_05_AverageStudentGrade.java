import java.util.*;

public class A01_05_AverageStudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int spins = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> students = new TreeMap<>();

        for (int i = 0; i < spins; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            Double grade = Double.parseDouble(input[1]);

            if (!students.containsKey(name)) {
                students.put(name, new ArrayList<>());
            }
            students.get(name).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry: students.entrySet()) {
            System.out.printf("%s -> ", entry.getKey());
            double sumGrades = 0;
            for (double grade : entry.getValue()) {
                System.out.printf("%.2f ", grade);
                sumGrades += grade;
            }
            double averageGrade = sumGrades / entry.getValue().size();
            System.out.printf("(avg: %.2f)%n", averageGrade);
        }
    }
}

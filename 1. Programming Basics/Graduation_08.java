import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String student = scanner.nextLine();
        double note = Double.parseDouble(scanner.nextLine());
        int grade = 1;
        double sumNotes = 0;
        int fail = 0;
        while (grade < 13) {
            if (note >= 4) {
                sumNotes += note;
                grade++;
            } else {
                fail++;
            }
            if (fail == 2) {
                System.out.printf("%s has been excluded at %d grade", student, grade);
                break;
            }
            if (grade < 13) {
                note = Double.parseDouble(scanner.nextLine());
            }
        }
        if (grade == 13) {
            double averageNotes = sumNotes / 12;
            System.out.printf("%s graduated. Average grade: %.2f", student, averageNotes);
        }
    }
}

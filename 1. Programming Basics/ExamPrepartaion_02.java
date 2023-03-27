import java.util.Scanner;

public class ExamPrepartaion_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int notGoodNotes = Integer.parseInt(scanner.nextLine());
        int notGoodNotesCounter = notGoodNotes;
        String exercise = scanner.nextLine();
        double grade = Double.parseDouble(scanner.nextLine());
        double sumNotes = 0;
        int exercisesCounter = 0;
        String lastExercise = "";
        while (!exercise.equals("Enough")) {
            if (grade <= 4) {
                notGoodNotesCounter--;
            }
            sumNotes += grade;
            exercisesCounter++;
            if (notGoodNotesCounter == 0) {
                System.out.printf("You need a break, %d poor grades.", notGoodNotes);
                break;
            }
            lastExercise = exercise;
            exercise = scanner.nextLine();
            if (!exercise.equals("Enough")) {
                grade = Double.parseDouble(scanner.nextLine());
            }
        }
        if (notGoodNotesCounter > 0) {
            double averageScore = sumNotes / exercisesCounter;
            System.out.printf("Average score: %.2f%n", averageScore);
            System.out.printf("Number of problems: %d%n", exercisesCounter);
            System.out.printf("Last problem: %s", lastExercise);
        }
    }
}

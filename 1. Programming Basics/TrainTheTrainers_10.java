import java.util.Scanner;

public class TrainTheTrainers_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jury = Integer.parseInt(scanner.nextLine());
        String presentation = scanner.nextLine();
        double totalNotes = 0;
        int presentations = 0;
        while (!presentation.equals("Finish")) {
            presentations++;
            double notesForPresentation = 0;
            for (int i = 1; i <= jury ; i++) {
                double juryNote = Double.parseDouble(scanner.nextLine());
                notesForPresentation += juryNote;
                totalNotes += juryNote;
            }
            double averageForPresentation = notesForPresentation / jury;
            System.out.printf("%s - %.2f.%n", presentation, averageForPresentation);
            presentation = scanner.nextLine();
        }
        double finalAverage = totalNotes / (jury * presentations);
        System.out.printf("Student's final assessment is %.2f.", finalAverage);
    }
}

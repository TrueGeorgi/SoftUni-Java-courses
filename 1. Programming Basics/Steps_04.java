import java.util.Scanner;

public class Steps_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int stepsCounter = 0;
        while (!input.equals("Going home")) {
            int steps = Integer.parseInt(input);
            stepsCounter += steps;
            if (stepsCounter >= 10000) {
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("Going home")) {
            int finalSteps = Integer.parseInt(scanner.nextLine());
            stepsCounter += finalSteps;
        }
        int difference = stepsCounter - 10000;
        if (stepsCounter >= 10000) {
            System.out.printf("Goal reached! Good job!%n");
            System.out.printf("%d steps over the goal!", difference);
        } else {
            System.out.printf("%d more steps to reach goal.", Math.abs(difference));
        }
    }
}

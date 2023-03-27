package ConditionalStatementsLab02;

import java.util.Scanner;

public class AreaOfFigures_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shape = scanner.nextLine();
        if ("square".equals(shape)) {
            double a = Double.parseDouble(scanner.nextLine());
            double area = a * a;
            System.out.println(area);
        } else if ("rectangle".equals(shape)) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double area = a * b;
            System.out.println(area);
        } else if ("circle".equals(shape)) {
            double radius = Double.parseDouble(scanner.nextLine());
            double area = Math.PI * radius * radius;
            System.out.println(area);
        } else if ("triangle".equals(shape)) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double area = a * b / 2;
            System.out.println(area);
        }
    }
}

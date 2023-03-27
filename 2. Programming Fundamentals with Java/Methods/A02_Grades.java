import java.util.Scanner;

public class A02_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        checkWord(grade);
    }
    public static void checkWord (double input) {
        String word = "";
        if (input >= 2.00 && input <= 2.99) {
            word = "Fail";
        } else if (input <= 3.49){
            word = "Poor";
        } else if (input <= 4.49) {
            word = "Good";
        } else if (input <= 5.49) {
            word = "Very good";
        } else {
            word = "Excellent";
        }
        System.out.printf("%s", word);
    }
}

import java.util.ArrayDeque;
import java.util.Scanner;

public class AE08_InfixToPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<String> operators = new ArrayDeque<>();
        ArrayDeque<String> output = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            String currentSymbol = input[i];
            char current = currentSymbol.charAt(0);
            if (current >= 48 && current <= 57) { // is number
                output.offer(currentSymbol);
            } else if (current >= 97 && current <= 122) { // is letter
                output.offer(currentSymbol);
            } else if (current == '(') {
                operators.push(currentSymbol);
            } else if (current == ')') {
                String poppedSymbol = operators.pop();
                while (!poppedSymbol.equals("(")) {
                    output.offer(poppedSymbol);
                    poppedSymbol = operators.pop();
                }
            } else if (current == '+' || current == '-' || current == '*' || current == '/') {

                if (operators.isEmpty()) {
                    operators.push(currentSymbol);
                } else {
                    char topSymbol;
                    switch (current) {
                        case '+':
                        case '-':
                            topSymbol = operators.peek().charAt(0);
                            while ((topSymbol == '*' || topSymbol == '/' || topSymbol == '+' || topSymbol == '-') && !operators.isEmpty()) {
                                output.offer(operators.pop());
                                if (!operators.isEmpty()) {
                                    topSymbol = operators.peek().charAt(0);
                                }
                            }
                            operators.push(currentSymbol);
                            break;
                        case '*':
                        case '/':
                            topSymbol = operators.peek().charAt(0);
                            while ((topSymbol == '*' || topSymbol == '/') && !operators.isEmpty()) {
                                output.offer(operators.pop());
                                if (!operators.isEmpty()) {
                                    topSymbol = operators.peek().charAt(0);
                                }
                            }
                            operators.push(currentSymbol);
                            break;
                    }
                }
            }
        }

        while (!operators.isEmpty()) {
            output.offer(operators.pop());
        }

        while (!output.isEmpty()) {
            System.out.print(output.poll() + " ");
        }
    }
}

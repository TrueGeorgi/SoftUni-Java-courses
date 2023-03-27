import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A01_Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)\\b";
        Pattern pattern = Pattern.compile(regex);
        List<String> furniture = new ArrayList<>();
        double totalPrice = 0;

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String currentFurniture = matcher.group("furniture");
                double currentPrice = Double.parseDouble(matcher.group("price"));
                int currentQuantity = Integer.parseInt(matcher.group("quantity"));

                totalPrice += currentPrice * currentQuantity;
                furniture.add(currentFurniture);
            }
            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}

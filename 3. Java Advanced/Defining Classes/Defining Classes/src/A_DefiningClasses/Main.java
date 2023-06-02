package A_DefiningClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<BankAccount> accounts = new ArrayList<>();

        while (!input.equals("End")) {
            String action = input.split("\\s+")[0];

            switch (action) {
                case "Create":
                    accounts.add(new BankAccount());
                    System.out.println("Account ID" + (BankAccount.getId() - 1) + " created");
                    break;
                case "Deposit":
                    int id = Integer.parseInt(input.split("\\s+")[1]);
                    if (id > 0 && id <= accounts.size()) {
                        double amount = Double.parseDouble(input.split("\\s+")[2]);
                        accounts.get(id - 1).setBalance(amount);
                        System.out.printf("Deposited %.0f to ID%d%n", amount, id);
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
                case "SetInterest":
                    double newInterest = Double.parseDouble(input.split("\\s+")[1]);
                    BankAccount.setInterestRate(newInterest);
                    break;
                case "GetInterest":
                    id = Integer.parseInt(input.split("\\s+")[1]);
                    if (id > 0 && id <= accounts.size()) {
                        int years = Integer.parseInt(input.split("\\s+")[2]);
                        System.out.printf("%.2f%n", accounts.get(id-1).getInterest(years));
                    } else {
                        System.out.println("Account does not exist");
                    }
                    break;
            }

            input = scanner.nextLine();
        }
    }
}

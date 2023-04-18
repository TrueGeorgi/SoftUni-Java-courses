package A01_CarInfo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Integer, BankAccount> accounts = new LinkedHashMap<>();

        while (!input.equals("End")) {

            String action = input.split("\\s+")[0];



            switch (action) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    accounts.put(bankAccount.getCurrentId(), bankAccount);
                    System.out.println("Account ID" + bankAccount.getCurrentId() + " created");
                    break;
                case "Deposit":
                    int id = Integer.parseInt(input.split("\\s+")[1]);
                    int amount = Integer.parseInt(input.split("\\s+")[2]);
                    if (id > accounts.size()) {
                        System.out.println("Account does not exist");
                    } else {
                        BankAccount currentBankAccount = accounts.get(id);
                        currentBankAccount.deposit(amount);
                        System.out.println("Deposited " + amount + " to ID" + id);
                    }
                    break;
                case "SetInterest":
                    double interest = Double.parseDouble(input.split("\\s+")[1]);
                    BankAccount.setInterestRate(interest);
                    break;
                case "GetInterest":
                    id = Integer.parseInt(input.split("\\s+")[1]);
                    int years = Integer.parseInt(input.split("\\s+")[2]);
                    if (id > accounts.size()) {
                        System.out.println("Account does not exist");
                    } else {
                        BankAccount currentBankAccount = accounts.get(id);
                       double output = currentBankAccount.getInterestRate(years);
                        System.out.printf("%.2f%n", output);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
    }
}

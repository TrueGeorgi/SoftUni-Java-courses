package A_DefiningClasses;

public class BankAccount {

    private static double interestRate = 0.02;

    private static int id = 1;

    private double balance;

                                      ///


    public BankAccount() {
        id++;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    public double getInterest(int years) {
        double oneYearInterest = this.balance * interestRate;
        return oneYearInterest * years;
    }

    public static int getId() {
        return id;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }
}

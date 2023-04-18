package A01_CarInfo;

public class BankAccount {
    //-----------------Statics-------------------
    private static int id = 1;

    private static double interestRate = 0.02;

    //----------------Objects------------------------

    private int currentId = 0;

    private double balance = 0.0;

    // -------------Getters-----------------------------------

    public int getCurrentId() {
        return currentId;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate(int years) {
        return (interestRate * years) * balance;
    }
    // -------------Setters-----------------------------------
    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }
    // -------------Constructors-----------------------------------

    public BankAccount() {
        this.currentId = id;
        id++;
    }
    // -------------Others-----------------------------------
    public void deposit (double amount) {
        balance += amount;
    }
}

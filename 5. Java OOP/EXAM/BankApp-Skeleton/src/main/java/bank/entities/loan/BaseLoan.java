package bank.entities.loan;

public abstract class BaseLoan implements Loan {

    // parameters
    private int interestRate;
    private double amount;
    // constructor

    protected BaseLoan(int interestRate, double amount) {
        this.interestRate = interestRate;
        this.amount = amount;
    }

    // getters and setters

    @Override
    public int getInterestRate() {
        return this.interestRate;
    }

    @Override
    public double getAmount() {
        return this.amount;
    }
    // Methods


}

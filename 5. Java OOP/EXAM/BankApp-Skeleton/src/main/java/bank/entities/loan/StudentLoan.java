package bank.entities.loan;

public class StudentLoan extends BaseLoan {

    private final static int DEFAULT_INTEREST_RATE = 1;
    private final static double DEFAULT_AMOUNT = 10000;

    public StudentLoan() {
        super(DEFAULT_INTEREST_RATE, DEFAULT_AMOUNT);
    }
}

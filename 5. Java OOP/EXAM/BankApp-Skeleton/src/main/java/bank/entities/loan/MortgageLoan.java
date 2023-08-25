package bank.entities.loan;

public class MortgageLoan extends BaseLoan {

    private final static int DEFAULT_INTEREST_RATE = 3;
    private final static double DEFAULT_AMOUNT = 50000;

    public MortgageLoan() {
        super(DEFAULT_INTEREST_RATE, DEFAULT_AMOUNT);
    }
}

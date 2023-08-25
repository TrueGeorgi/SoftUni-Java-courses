package bank.entities.client;

public class Adult extends BaseClient {
    // TODO can only live in central Bank
    // parameters
    private final static int DEFAULT_INTEREST_PERCENT = 4;
    // constructor
    public Adult(String name, String id, double income) {
        super(name, id, DEFAULT_INTEREST_PERCENT, income);
    }
    // getters and setters
    // methods
// TODO maybe percent not just add
    @Override
    public void increase() {
        int interest = getInterest() + 2;
        setInterest(interest);
    }
}

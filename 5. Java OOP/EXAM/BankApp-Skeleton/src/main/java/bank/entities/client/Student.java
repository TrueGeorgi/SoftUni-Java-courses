package bank.entities.client;

public class Student extends BaseClient {
    // TODO can only live in BranchBank


    // parameters

    private final static int DEFAULT_INTEREST_PERCENT = 2;
    // constructor
    public Student(String name, String id, double income) {
        super(name, id, DEFAULT_INTEREST_PERCENT, income);
    }
    // getters and setters
    // methods

    // TODO maybe not just add percent
    @Override
    public void increase() {
        int interest = getInterest() + 1;
        setInterest(interest);
    }
}

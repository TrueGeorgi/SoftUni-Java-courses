package bank.entities.bank;

public class CentralBank extends BaseBank {
    private final static int DEFAULT_CAPACITY = 50;

    public CentralBank(String name) {
        super(name, DEFAULT_CAPACITY);
    }
}

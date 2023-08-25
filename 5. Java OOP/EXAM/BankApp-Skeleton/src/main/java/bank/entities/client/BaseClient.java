package bank.entities.client;

import bank.common.ExceptionMessages;

public abstract class BaseClient implements Client {

    // parameters
    private String name;
    private String id;
    private int interest;
    private double income;
    // constructor

    protected BaseClient(String name, String id, int interest, double income) {
        setName(name);
        setId(id);
        setInterest(interest);
        setIncome(income);
    }

    // getters and setters

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.CLIENT_NAME_CANNOT_BE_NULL_OR_EMPTY);
        }

        this.name = name;
    }

    protected void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.CLIENT_ID_CANNOT_BE_NULL_OR_EMPTY);
        }

        this.id = name;
    }

    @Override
    public int getInterest() {
        return this.interest;
    }

    protected void setInterest(int interest) {
        this.interest = interest;
    }

    @Override
    public double getIncome() {
        return this.income;
    }

    protected void setIncome(double income) {
        if (income <= 0 ) {
            throw new IllegalArgumentException(ExceptionMessages.CLIENT_INCOME_CANNOT_BE_BELOW_OR_EQUAL_TO_ZERO);
        }

        this.income = income;
    }

    // methods

    @Override
    public abstract void increase();







}

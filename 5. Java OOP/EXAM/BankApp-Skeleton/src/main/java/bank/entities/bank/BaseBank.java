package bank.entities.bank;

import bank.common.ExceptionMessages;
import bank.entities.client.Client;
import bank.entities.loan.Loan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public abstract class BaseBank implements Bank {

    // parameters
    private String name;
    private int capacity;
    private Collection<Loan> loans;
    private Collection<Client> clients;
    // constructor

    public BaseBank(String name, int capacity) {
        setName(name);
        setCapacity(capacity);
        loans = new ArrayList<>();
        clients = new ArrayList<>();
    }

    // getters and setters
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException(ExceptionMessages.BANK_NAME_CANNOT_BE_NULL_OR_EMPTY);
        }

        this.name = name;
    }

    protected void setCapacity(int capacity) {
        this.capacity = capacity;
    }
 // TODO for now return unmodiffiable list
    @Override
    public Collection<Client> getClients() {
        return Collections.unmodifiableCollection(clients);
    }

    @Override
    public Collection<Loan> getLoans() {
        return Collections.unmodifiableCollection(loans);
    }

    // Methods





    @Override
    public void addClient(Client client) {
        if (clients.size() >= capacity) {
            throw new IllegalStateException(ExceptionMessages.NOT_ENOUGH_CAPACITY_FOR_CLIENT);
        } else {
                clients.add(client);
        }
    }

    @Override
    public void removeClient(Client client) {
        clients.remove(client);
    }

    @Override
    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    @Override
    public int sumOfInterestRates() {
        int sum = 0;
        for (Loan loan : loans) {
            sum += loan.getInterestRate();
        }
        return sum;
    }
    // TODO quite long...maybe here is the problem
    @Override
    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        String intro = String.format("Name: %s, Type: %s", getName(), getClass().getSimpleName()); // TODO maybe the getClass ...
        String clientsString = "Clients: ";

        if (clients.isEmpty()) {
            clientsString += "none";
        } else {
            List<String> names = new ArrayList<>();
            for (Client client : clients) {
                names.add(client.getName());
            }
            clientsString += String.join(", ", names);
        }
        int loanCount = loans.size();
        int sumOfInterest = sumOfInterestRates();
        String loansString = String.format("Loans: %d, Sum of interest rates: %d", loanCount, sumOfInterest);
        sb.append(intro).append("\n").append(clientsString).append("\n").append(loansString);
        return String.valueOf(sb);
    }
}

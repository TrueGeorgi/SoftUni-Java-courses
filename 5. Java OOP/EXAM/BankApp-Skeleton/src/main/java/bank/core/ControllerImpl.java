package bank.core;

import bank.common.ExceptionMessages;
import bank.entities.bank.Bank;
import bank.entities.bank.BranchBank;
import bank.entities.bank.CentralBank;
import bank.entities.client.Adult;
import bank.entities.client.Client;
import bank.entities.client.Student;
import bank.entities.loan.Loan;
import bank.entities.loan.MortgageLoan;
import bank.entities.loan.StudentLoan;
import bank.repositories.LoanRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ControllerImpl implements Controller {

    private LoanRepository loans;
    private Collection<Bank> banks;

    public ControllerImpl() {
        loans = new LoanRepository();
        banks = new ArrayList<>();
    }

    @Override
    public String addBank(String type, String name) {
        Bank bank;
        if (type.equals("CentralBank")) {
            bank = new CentralBank(name);
        } else if (type.equals("BranchBank")) {
            bank = new BranchBank(name);
        } else {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_BANK_TYPE);
        }
        banks.add(bank);
        return String.format("%s is successfully added.", type);
    }

    @Override
    public String addLoan(String type) {
        Loan loan;
        if (type.equals("StudentLoan")) {
            loan = new StudentLoan();
        } else if (type.equals("MortgageLoan")) {
            loan = new MortgageLoan();
        } else {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_LOAN_TYPE);
        }
        loans.addLoan(loan);
        return String.format("%s is successfully added.", type);
    }
    // TODO return null is kind of tricky
    @Override
    public String returnedLoan(String bankName, String loanType) {
        Loan loan = loans.findFirst(loanType);
        if (loan == null) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.NO_LOAN_FOUND, loanType));
        } else {
            for (Bank bank:banks) {
                if (bank.getName().equals(bankName)) {
                    bank.addLoan(loan);
                    return String.format("%s successfully added to %s.", loanType, bankName);
                }
            }
        }
        return null;
    }

    @Override
    public String addClient(String bankName, String clientType, String clientName, String clientID, double income) {
        Client client;
        if (clientType.equals("Student")) {
            client = new Student(clientName, clientID, income);
        } else if (clientType.equals("Adult")) {
            client = new Adult(clientName, clientID, income);
        } else {
            throw new IllegalArgumentException(ExceptionMessages.INVALID_CLIENT_TYPE);
        }

        for (Bank bank:banks) {
            if (bank.getName().equals(bankName)) {
                if (correctClientBankRelation(client, bank)) {
                    bank.addClient(client);
                    return String.format("%s successfully added to %s.", clientType, bankName);
                } else {
                    return "Unsuitable bank.";
                }
            }
        }
        return null;
    }

    @Override
    public String finalCalculation(String bankName) {
        double sum = 0;
        for (Bank bank:banks) {
            if (bank.getName().equals(bankName)) {
                for (Client client: bank.getClients()) {
                    sum += client.getIncome();
                }
                for (Loan loan:bank.getLoans()) {
                    sum += loan.getAmount();
                }
            }
        }

        return String.format("The funds of bank %s is %.2f.", bankName, sum);
    }

    @Override
    public String getStatistics() {
        List<String> output = new ArrayList<>();
        for (Bank bank:banks) {
            output.add(bank.getStatistics());
        }
        return String.join("\n", output);
    }

    private boolean correctClientBankRelation (Client client, Bank bank) {
        String clientType = client.getClass().getSimpleName();
        String bankType =  bank.getClass().getSimpleName();
        return (clientType.equals("Adult") && bankType.equals("CentralBank")) || (clientType.equals("Student") && bankType.equals("BranchBank"));
    }
}

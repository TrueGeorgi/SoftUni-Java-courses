package bank.repositories;

import bank.entities.loan.Loan;

import java.util.ArrayList;
import java.util.Collection;

public class LoanRepository implements Repository{

    private Collection<Loan> loans;

    public LoanRepository() {
        loans = new ArrayList<>();
    }

    @Override
    public void addLoan(Loan loan) {
        loans.add(loan);
    }

    @Override
    public boolean removeLoan(Loan loan) {
        if (loans.contains(loan)) {
            loans.remove(loan);
            return true;
        } else {
            return false;
        }
    }
// TODO meh...maybe?
    @Override
    public Loan findFirst(String type) {
        Loan toBeReturned;
        for (Loan loan : loans) {
            if (loan.getClass().getSimpleName().equals(type)) {
                toBeReturned = loan;
                loans.remove(toBeReturned);
                return toBeReturned;
            }
        }
        return null;
    }
}

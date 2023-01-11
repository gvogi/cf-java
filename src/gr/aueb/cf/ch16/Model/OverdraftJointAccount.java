package gr.aueb.cf.ch16.Model;

import gr.aueb.cf.ch16.exceptions.InsufficientBalanceException;
import gr.aueb.cf.ch16.exceptions.SsnNotValidException;

public class OverdraftJointAccount extends JointAccount {

    public OverdraftJointAccount() {
    }

    public OverdraftJointAccount(User firstHolder, User secondHolder, String iban, double balance) {
        super(firstHolder, secondHolder, iban, balance);
    }

    @Override
    public void withdraw(double amount, String ssn) throws InsufficientBalanceException, SsnNotValidException {
        try {
            if (!isSsnValid(ssn)) {
                throw new SsnNotValidException(ssn);
            }
            setBalance(getBalance() - amount);
        }catch (SsnNotValidException e) {
            System.err.println("Error: withdrawal");
            throw e;
        }
    }
}

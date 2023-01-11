package gr.aueb.cf.ch16.Model;

import gr.aueb.cf.ch16.exceptions.SsnNotValidException;

public class OverdraftAccount extends Account {

    public OverdraftAccount() {}

    public OverdraftAccount(String iban, User holder, double balance) {
        super(iban, holder, balance);
    }

    @Override
    public void withdraw(double amount, String ssn) throws SsnNotValidException {
        try {
            if (!isSsnValid(ssn)) {
                throw new SsnNotValidException(ssn);
            }
            setBalance(getBalance() - amount);
        }catch (SsnNotValidException e) {
            System.err.println("Error in ssn withdraw " + e);
            throw e;
        }
    }
}

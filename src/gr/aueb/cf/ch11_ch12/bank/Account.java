package gr.aueb.cf.ch11_ch12.bank;

public final class Account {
    private final Holder holder;
    private final String iban;
    private double balance;

    public Account() {
        holder = new Holder();
        iban = "";
    }

    public Account(Holder holder, String iban, double balance) {
        this.holder = holder;
        this.iban = iban;
        this.balance = balance;
    }

    public Holder getHolder() {
        return holder;
    }

    public String getIban() {
        return iban;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String convertToString() {
        return holder.convertToString() + ", " + iban + ", " + String.format("%.2f", balance);
    }
}

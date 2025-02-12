public class Account {
    private AccountState state;

    private String accountNumber;

    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.state = new ActiveState();
    }
    
    public String toString() {
        return "Current balance: " + balance + ", Account Number: " + accountNumber;
    }

    public void activate() {
        state.activate(this);
    }

    public void suspend() {
        state.suspend(this);
    }

    public void close() {
        state.close(this);
    }

    public void deposit(double amount) {
        state.deposit(this, amount);
    }

    public void withdraw(double amount) {
        state.withdraw(this,amount);
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

}
public class Account {
    private AccountState state;

    private String accountNumber;

    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.state = new ActiveState(this);
    }
    
    public String toString() {
        return "Current balance: " + balance + ", Account Number: " + accountNumber;
    }

    public void activate() {
        state.activate();
    }

    public void suspend() {
        state.suspend();
    }

    public void close() {
        state.close();
    }

    public void deposit(double amount) {
        state.deposit(amount);
    }

    public void withdraw(double amount) {
        state.withdraw(amount);
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

}
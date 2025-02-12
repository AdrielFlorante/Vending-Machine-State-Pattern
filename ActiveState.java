public class ActiveState implements AccountState {
    private Account account;

    public ActiveState(Account account) {
        this.account = account;
    }

    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println(account.toString());
    }

    public void withdraw(double amount) {
        account.setBalance(account.getBalance() - amount);
        System.out.println(account.toString());
    }

    public void activate() {
        System.out.println("Account is already activated!");
    }

    public void suspend() {
        account.setState(new SuspendedState());
        System.out.println("Account is suspended!");
    }

    public void close() {
        account.setState(new ClosedState());
        System.out.println("Account is closed!");
    }
}
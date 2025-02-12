public class SuspendedState implements AccountState {
    private Account account;

    public void deposit(double amount) {
        System.out.println("You cannot deposit on a suspended account!\n" + account.toString());
        account.toString();
    }

    public void withdraw(double amount) {
        System.out.println("You cannot withdraw on a suspended account!\n" + account.toString());
        account.toString();
    }

    public void activate() {
        account.setState(new ActiveState());
        System.out.println("Account is activated!");
    }

    public void suspend() {
        System.out.println("Account is already suspended!");
    }

    public void close() {
        account.setState(new ClosedState());
        System.out.println("Account is closed!");
    }
}
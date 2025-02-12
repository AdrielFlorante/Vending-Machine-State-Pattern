public class SuspendedState implements AccountState {
    public void deposit(Account account, double amount) {
        System.out.println("You cannot deposit on a suspended account!\n" + account.toString());
        account.toString();
    }

    public void withdraw(Account account, double amount) {
        System.out.println("You cannot withdraw on a suspended account!\n" + account.toString());
        account.toString();
    }

    public void activate(Account account) {
        account.setState(new ActiveState());
        System.out.println("Account is activated!");
    }

    public void suspend(Account account) {
        System.out.println("Account is already suspended!");
    }

    public void close(Account account) {
        account.setState(new ClosedState());
        System.out.println("Account is closed!");
    }
}
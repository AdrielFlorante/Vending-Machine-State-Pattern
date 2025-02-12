public class ClosedState implements AccountState {
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
        System.out.println("You cannot activate a closed account!");
    }

    public void suspend(Account account) {
        System.out.println("You cannot suspend a closed account!");
    }

    public void close(Account account) {
        System.out.println("Account is already closed!");
    }
}
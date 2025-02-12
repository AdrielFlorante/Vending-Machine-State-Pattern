public class ClosedState implements AccountState {
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
        System.out.println("You cannot activate a closed account!");
    }

    public void suspend() {
        System.out.println("You cannot suspend a closed account!");
    }

    public void close() {
        System.out.println("Account is already closed!");
    }
}
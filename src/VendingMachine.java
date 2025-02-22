public class VendingMachine {
    private VendingMachineState state;

    // implement ItemInventory?
    private double balance;
    private String itemSelected;

    public void setState(VendingMachineState state) { // to set the state
        this.state = state;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

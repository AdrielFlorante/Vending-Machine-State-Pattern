public class VendingMachine {
    private VendingMachineState state;

    // implement ItemInventory?
    private double balance;
    private String itemInventory;

    public void setState(VendingMachineState state) { // to set the state
        this.state = state;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getItemInventory() {
        return itemInventory;
    }

    public void setItemInventory(String itemInventory) {
        this.itemInventory = itemInventory;
    }
}

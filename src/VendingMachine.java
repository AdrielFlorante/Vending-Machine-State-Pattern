public class VendingMachine {
    private VendingMachineState state;

    // implement ItemInventory?
    private double balance;
    private String itemInventory;

    public VendingMachine() {
        this.state = new Idle(this); // Forgot this part oops
    }

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

    public void selectItem(String itemInventory) {
        state.selectItem(itemInventory);
    }

    public void insertCoin() {
        state.insertCoin();
    }

    public void setOutOfOrder() {
        state.setOutOfOrder();
    }

    public void dispenseItem() {
        state.dispenseItem();
    }
}

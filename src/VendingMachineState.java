public interface VendingMachineState {
    public void dispenseItem();
    public void insertCoin();
    public void selectItem(String itemName);
    public void setOutOfOrder();
}

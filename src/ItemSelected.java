public class ItemSelected implements VendingMachineState {
    private VendingMachine vendingMachine = new VendingMachine();

    public ItemSelected(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void dispenseItem() {

    }

    @Override
    public void insertCoin() {
        System.out.println("Coin has been inserted!");
    }

    @Override
    public void selectItem(String itemName) {
        System.out.println("You've already selected an item!");
    }

    @Override
    public void setOutOfOrder() {

    }
}

public class ItemSelected implements VendingMachineState {
    private VendingMachine vendingMachine;

    public ItemSelected(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void dispenseItem() {
        System.out.println(vendingMachine.getItemInventory() + " was dispensed!");
        vendingMachine.setState(new Idle(vendingMachine));
    }

    @Override
    public void insertCoin() {
        vendingMachine.setBalance(vendingMachine.getBalance() + '1'); // Let's just say every item is worth 1 each for now
        System.out.println("Coin has been inserted!");
    }

    @Override
    public void selectItem(String itemName) {
        System.out.println("You have already selected an item!");
    }

    public void setOutOfOrder() {
        vendingMachine.setState(new OutOfOrder(vendingMachine));
        System.out.println("You cannot set Vending Machine out of order now!");
    }
}

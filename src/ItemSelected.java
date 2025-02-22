public class ItemSelected implements VendingMachineState {
    private VendingMachine vendingMachine = new VendingMachine();

    public ItemSelected(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void dispenseItem() {
        System.out.println(vendingMachine.getItemSelected() + " was dispensed!");
        vendingMachine.setState(new Idle(vendingMachine));
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin has been inserted!");
    }

    @Override
    public void selectItem(String itemName) {
        System.out.println("Cannot select now, you've already selected an item!");
    }

    @Override
    public void setOutOfOrder() {
        System.out.println("You cannot set Vending Machine out of order now!");
    }
}

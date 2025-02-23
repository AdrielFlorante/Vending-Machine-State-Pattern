public class Idle implements VendingMachineState {
    private VendingMachine vendingMachine;

    public Idle(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void dispenseItem() {
        System.out.println("You cannot dispense an item without selecting one first!");
    }

    @Override
    public void insertCoin() {
        System.out.println("You cannot insert a coin yet!");
    }

    @Override
    public void selectItem(String itemName) {
        // I think there should be something more here
        vendingMachine.setItemInventory(itemName);
        System.out.println(itemName + " has been selected!");
        vendingMachine.setState(new ItemSelected(vendingMachine));
    }

    @Override
    public void setOutOfOrder() {
        System.out.println("Vending Machine is out of order now!");
    }
}

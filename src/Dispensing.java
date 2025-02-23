public class Dispensing implements VendingMachineState {
    private VendingMachine vendingMachine;

    public Dispensing(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void dispenseItem() {
        vendingMachine.setState(new Dispensing(vendingMachine));
        System.out.println("Item has been dispensed!");
        // Call the selected itemName from selectItem?
    }

    @Override
    public void insertCoin() {
        System.out.println("You cannot insert a coin now!");
    }

    @Override
    public void selectItem(String itemName) {
        System.out.println("You cannot select an item now!");
    }

    @Override
    public void setOutOfOrder() {
        System.out.println("You cannot set Vending Machine out of order now!");
    }
}

public class OutOfOrder implements VendingMachineState {
    private VendingMachine vendingMachine = new VendingMachine();

    public OutOfOrder(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void dispenseItem() {
        System.out.println("Vending Machine is out of order, cannot dispense!");
    }

    @Override
    public void insertCoin() {
        System.out.println("Vending Machine is out of order, cannot insert coins!");
    }

    @Override
    public void selectItem(String itemName) {
        System.out.println("Vending Machine is out of order, cannot select item!");
    }

    @Override
    public void setOutOfOrder() {
        System.out.println("Vending Machine is already out of order!");
    }
}

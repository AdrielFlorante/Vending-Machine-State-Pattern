public class Idle implements VendingMachineState {
    private VendingMachine vendingMachine;

    @Override
    public void dispenseItem() {
        System.out.println("Dispensing an item here!");
        // Call the selected itemName from selectItem?
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin has been inserted!");
    }

    @Override
    public void selectItem(String itemName) {
        // I think there should be something more here
        System.out.println(itemName + " has been selected!");
    }

    @Override
    public void setOutOfOrder() {
        System.out.println("Vending Machine is out of order now!");
    }
}

public class VendingMachineTest {
    public static void main(String[] args) {
        // Create a VendingMachine object (initial state is Idle)
        VendingMachine vendingMachine = new VendingMachine();

        // Test behavior in Idle state
        System.out.println("Test Case: In Idle State");
        vendingMachine.insertCoin(); // Cannot insert a coin while idle
        vendingMachine.selectItem("Coca Cola"); // Should transition to ItemSelected
        vendingMachine.insertCoin(); // Adds 1 coin to balance and transitions to Dispensing

        // Test methods in ItemSelected state
        System.out.println("\nTest Case: In ItemSelected State");
        vendingMachine.insertCoin(); // As it turns out, you may insert more coins but this is unintended behavior... You still need to call "Dispense Item" as if pressing the button
        vendingMachine.selectItem("Pepsi"); // Won't work, because an item is already selected
        vendingMachine.dispenseItem(); // Will transition to Dispensing state
        vendingMachine.setOutOfOrder(); // Should transition to OutOfOrder

        // Test behavior in OutOfOrder state
        System.out.println("\nTest Case: In OutOfOrder State");
        vendingMachine.selectItem("Pepsi"); // Should not work in OutOfOrder state
        vendingMachine.insertCoin(); // Should not work in OutOfOrder state
        vendingMachine.dispenseItem(); // Will not work
        vendingMachine.setOutOfOrder(); // No change, it's already out of order
    }
}

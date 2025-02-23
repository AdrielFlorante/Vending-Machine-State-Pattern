public class VendingMachineTest {
    public static void main(String[] args) {
        // Create a VendingMachine object (initial state is Idle)
        VendingMachine vendingMachine = new VendingMachine();

        // Test behavior in Idle state
        System.out.println("Test Case: In Idle State");
        vendingMachine.selectItem("Coca Cola"); // Should transition to ItemSelected
        vendingMachine.insertCoin(); // Adds 1 coin to balance and transitions to Dispensing

        vendingMachine.insertCoin(); // Shouldn't be able to insert a coin because Dispensing immediately goes back to Idle
        vendingMachine.selectItem("Coca Cola"); // May work?
        vendingMachine.setOutOfOrder(); // Should transition to OutOfOrder

        // Test behavior in OutOfOrder state
        System.out.println("\nTest Case: In OutOfOrder State");
        vendingMachine.selectItem("Pepsi"); // Should not work in OutOfOrder state
        vendingMachine.insertCoin(); // Should not work in OutOfOrder state
        vendingMachine.setOutOfOrder(); // No change, it's already out of order
    }
}

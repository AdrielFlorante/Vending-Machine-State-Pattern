public class VendingMachineTest {
    public static void main(String[] args) {
        // Create a VendingMachine object (initial state is Idle)
        VendingMachine vendingMachine = new VendingMachine();

        // Test behavior in Idle state
        System.out.println("Test Case: In Idle State");
        vendingMachine.selectItem("Coca Cola"); // Should transition to ItemSelected
        vendingMachine.insertCoin(); // Should not work in Idle state, so will print error

        // Test behavior in ItemSelected state
        System.out.println("\nTest Case: In ItemSelected State");
        vendingMachine.insertCoin(); // Should transition to Dispensing state
        vendingMachine.selectItem("Coca Cola"); // Should not work in ItemSelected state
        vendingMachine.setOutOfOrder(); // Should transition to OutOfOrder

        // Test behavior in OutOfOrder state
        System.out.println("\nTest Case: In OutOfOrder State");
        vendingMachine.selectItem("Pepsi"); // Should not work in OutOfOrder state
        vendingMachine.insertCoin(); // Should not work in OutOfOrder state
        vendingMachine.setOutOfOrder(); // No change, it's already out of order

        // Test behavior in Dispensing state
        System.out.println("\nTest Case: In Dispensing State");
        vendingMachine.selectItem("Coca Cola"); // Should not work in Dispensing state
        vendingMachine.insertCoin(); // Should not work in Dispensing state
        vendingMachine.dispenseItem(); // Should transition back to Idle state

        // Test behavior when returning to Idle state after dispensing
        System.out.println("\nTest Case: Back in Idle State After Dispensing");
        vendingMachine.selectItem("Coca Cola"); // Should transition to ItemSelected state
    }
}

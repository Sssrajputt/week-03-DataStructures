package submissionofdatastructure.bestpracticesfordatastructurelinkedlist.singlylinkedlist.inventorymanagementsystem;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        InventoryManagement im = new InventoryManagement();

        // Add items
        im.addAtBeginning("Item1", 101, 10, 50.5);
        im.addAtEnd("Item2", 102, 5, 100.0);
        im.addAtPosition("Item3", 103, 20, 30.0, 1);

        // Display all items
        im.displayAll();

        // Update quantity
        im.updateQuantity(102, 8);

        // Search item by ID
        InventoryItem foundItem = im.searchById(103);
        if (foundItem != null) {
            System.out.println("Found Item - Name: " + foundItem.itemName + ", ID: " + foundItem.itemId + ", Quantity: " + foundItem.quantity + ", Price: " + foundItem.price);
        }

        // Search item by Name
        foundItem = im.searchByName("Item1");
        if (foundItem != null) {
            System.out.println("Found Item - Name: " + foundItem.itemName + ", ID: " + foundItem.itemId + ", Quantity: " + foundItem.quantity + ", Price: " + foundItem.price);
        }

        // Calculate total value of inventory
        double totalValue = im.calculateTotalValue();
        System.out.println("Total Inventory Value: " + totalValue);

        // Sort inventory by name in descending order
        im.sortByNameDescending();
        im.displayAll();

        // Sort inventory by price in descending order
        im.sortByPriceDescending();
        im.displayAll();
    }
}

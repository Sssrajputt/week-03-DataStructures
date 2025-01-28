package submissionofdatastructure.bestpracticesfordatastructurelinkedlist.singlylinkedlist.inventorymanagementsystem;

public class InventoryManagement {
    InventoryItem head;

    // Add an item at the beginning
    public void addAtBeginning(String itemName, int itemId, int quantity, double price) {
        InventoryItem newItem = new InventoryItem(itemName, itemId, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    // Add an item at the end
    public void addAtEnd(String itemName, int itemId, int quantity, double price) {
        InventoryItem newItem = new InventoryItem(itemName, itemId, quantity, price);
        if (head == null) {
            head = newItem;
        } else {
            InventoryItem temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newItem;
        }
    }

    // Add an item at a specific position
    public void addAtPosition(String itemName, int itemId, int quantity, double price, int position) {
        InventoryItem newItem = new InventoryItem(itemName, itemId, quantity, price);
        if (position == 0) {
            newItem.next = head;
            head = newItem;
        } else {
            InventoryItem temp = head;
            for (int i = 0; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                newItem.next = temp.next;
                temp.next = newItem;
            }
        }
    }

    // Remove an item based on Item ID
    public void removeById(int itemId) {
        if (head == null) return;
        if (head.itemId == itemId) {
            head = head.next;
            return;
        }
        InventoryItem temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Update the quantity of an item by Item ID
    public void updateQuantity(int itemId, int newQuantity) {
        InventoryItem temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
    }

    // Search for an item based on Item ID
    public InventoryItem searchById(int itemId) {
        InventoryItem temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Search for an item based on Item Name
    public InventoryItem searchByName(String itemName) {
        InventoryItem temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(itemName)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Calculate and display the total value of inventory
    public double calculateTotalValue() {
        double totalValue = 0;
        InventoryItem temp = head;
        while (temp != null) {
            totalValue += temp.price * temp.quantity;
            temp = temp.next;
        }
        return totalValue;
    }

    // Sort the inventory based on Item Name in descending order
    public void sortByNameDescending() {
        if (head == null) return;

        for (InventoryItem current = head; current != null; current = current.next) {
            for (InventoryItem index = current.next; index != null; index = index.next) {
                if (current.itemName.compareToIgnoreCase(index.itemName) < 0) {
                    // Swap itemName
                    String tempName = current.itemName;
                    current.itemName = index.itemName;
                    index.itemName = tempName;

                    // Swap itemId
                    int tempId = current.itemId;
                    current.itemId = index.itemId;
                    index.itemId = tempId;

                    // Swap quantity
                    int tempQuantity = current.quantity;
                    current.quantity = index.quantity;
                    index.quantity = tempQuantity;

                    // Swap price
                    double tempPrice = current.price;
                    current.price = index.price;
                    index.price = tempPrice;
                }
            }
        }
    }

    // Sort the inventory based on Price in descending order
    public void sortByPriceDescending() {
        if (head == null) return;

        for (InventoryItem current = head; current != null; current = current.next) {
            for (InventoryItem index = current.next; index != null; index = index.next) {
                if (current.price < index.price) {
                    // Swap itemName
                    String tempName = current.itemName;
                    current.itemName = index.itemName;
                    index.itemName = tempName;

                    // Swap itemId
                    int tempId = current.itemId;
                    current.itemId = index.itemId;
                    index.itemId = tempId;

                    // Swap quantity
                    int tempQuantity = current.quantity;
                    current.quantity = index.quantity;
                    index.quantity = tempQuantity;

                    // Swap price
                    double tempPrice = current.price;
                    current.price = index.price;
                    index.price = tempPrice;
                }
            }
        }
    }

    // Display all items in the inventory
    public void displayAll() {
        InventoryItem temp = head;
        while (temp != null) {
            System.out.println("Item Name: " + temp.itemName + ", Item ID: " + temp.itemId + ", Quantity: " + temp.quantity + ", Price: " + temp.price);
            temp = temp.next;
        }
    }


}

package ObjectOrientedProgramming.ObjectAndClasses.level1;

class Item {
    int itemCode;
    String itemName;
    double price;

    void displayDetails() {
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item i = new Item();
        i.itemCode = 1001;
        i.itemName = "Keyboard";
        i.price = 750;

        int quantity = 3;

        i.displayDetails();
        System.out.println("Quantity   : " + quantity);
        System.out.println("Total Cost : " + i.calculateTotalCost(quantity));
    }
}


public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Item item1 = new Item("Generic", 69);
        Item item2 = new Item("Apple", 2);
        Item item3 = new Item("Gun", 1);

        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.addItem(item3);

        inventory.displayItems();
    }
}
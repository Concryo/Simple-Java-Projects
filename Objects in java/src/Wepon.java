public class Wepon {
    private String name;
    private String type;
    private int damage;
    private int quantity;

    public Wepon(String name, String type, int damage, int quantity) {
        this.name = name;
        this.type = type;
        this.damage = damage;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }

    public int getQuantity() {
        return quantity;
    }

}

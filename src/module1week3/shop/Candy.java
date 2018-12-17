package module1week3.shop;

public class Candy extends Product{
    private int quantity;

    public Candy(int id, double price, String name, int quantity) {
        super(id, price, name);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}

package module1week3.shop;

public class Basket {
    private double totalPrice;
    private double discountSilver;
    private double discountGold;

    public Basket(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    // method to add the selected product to basket and update total price
    public void addProduct (double itemPrice, int itemQuantity) {
        totalPrice += (itemPrice*itemQuantity);
        System.out.println("Total price to pay: " + totalPrice);
    }

    // method to get the total price and update it based on the membership status selection
    public void getTotalPrice (Customer client) {
        switch(client) {
            case NO: {
                System.out.println("You have no membership discount.");
                System.out.println("Total price to pay: " + totalPrice);
                break;
            }
            case SILVER: {
                System.out.println("Total price to pay: " + totalPrice);
                discountSilver = totalPrice*(10/100.0f);
                totalPrice = totalPrice - discountSilver;
                System.out.println("You have 10% discount for having SILVER membership which is " +
                        String.format("%.2f", discountSilver) + " out of the total price");
                System.out.println("New total price to pay: " + String.format("%.2f", totalPrice));
                break;
            }
            case GOLD: {
                System.out.println("Total price to pay: " + totalPrice);
                discountGold = totalPrice*(20/100.0f);
                totalPrice = totalPrice - discountGold;
                System.out.println("You have 20% discount for having GOLD membership which is " +
                        String.format("%.2f", discountGold) + " out of the total price");
                System.out.println("New total price to pay: " + String.format("%.2f", totalPrice));
                break;
            }
        }
    }
}

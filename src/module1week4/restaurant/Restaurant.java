package module1week4.restaurant;

public class Restaurant {
    protected String name;
    protected int guests;

    protected Restaurant(String name, int guests) {
        this.name = name;
        this.guests = guests;
    }

    public void addNewGuest () {
        guests += 1;
    }

    public int getGuests() {
        return guests;
    }
}
package module1week3.shop;

public enum Customer {
    GOLD,
    SILVER,
    NO;

    private int id;
    private String name;

    Customer() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

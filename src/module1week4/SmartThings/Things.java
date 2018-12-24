package module1week4.SmartThings;

public class Things implements BluetoothConnection{
    private String brand;
    private String model;

    public Things(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connecting " + brand + " " + model + " to bluetooth...");
        System.out.println("Connected!");
        System.out.println(" ");
    }
}

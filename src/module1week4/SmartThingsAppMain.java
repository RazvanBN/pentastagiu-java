package module1week4;

import module1week4.SmartThings.Car;
import module1week4.SmartThings.Phone;
import module1week4.SmartThings.SmartRefrigerator;
import module1week4.SmartThings.Things;

import java.util.ArrayList;
import java.util.List;

public class SmartThingsAppMain {
    public static void main(String[] args) {
        List<Object> arrayObjects = new ArrayList<>();

        arrayObjects.add(new Car("Tesla", "Model S"));
        arrayObjects.add(new Phone("OnePlus", "5T"));
        arrayObjects.add(new SmartRefrigerator("Samsung", "4-Door Flex"));
        arrayObjects.add(new Student("Razvan", 24));

        for(int i = 0; i<arrayObjects.size(); i++) {
            if(arrayObjects.get(i) instanceof Things) {
                ((Things) arrayObjects.get(i)).connectToBluetooth();
            } else {
                ((Student) arrayObjects.get(i)).notAThing();
            }
        }
    }
}

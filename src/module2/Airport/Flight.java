package module2.Airport;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
//import java.time.LocalDateTime;

enum StatusEnum {
    SCHEDULED,
    CANCELED,
    FINISHED;
}

public class Flight {
    public Map<String, User> users = new HashMap<>();
    private String name;
    private String destination;
    private Date departureDate;
    private int flightDuration;
    private int maxUserCapacity;
    private StatusEnum status;
    Format formatDate = new SimpleDateFormat("yyyy.MM.dd HH:mm");
   //private LocalDateTime testTime;

    public Flight(String name, String destination, String departureDate, int flightDuration, int maxUserCapacity, StatusEnum status) {
        this.name = name;
        this.destination = destination;
        setDapartureDate(departureDate);
        this.flightDuration = flightDuration;
        this.maxUserCapacity = maxUserCapacity;
        this.status = status;
    }

    public void setDapartureDate(String str){
        try {
            this.departureDate = (Date) formatDate.parseObject(str);
            // tried to test the month and day so an user can't enter day of month to be higher than 12 for example, same with the day. (didn't work)
            /* testTime = (LocalDateTime) departureDate;
            if(testTime.getDayOfMonth()<=31 && testTime.getMonthValue() <= 12) {
                this.departureDate = (Date) formatDate.parseObject(str);
            } */
        } catch(ParseException e) {
            System.out.println("The date format is not valid. Date format = yyyy.MM.dd HH:mm ." + e.getStackTrace());
        }
    }

    public void addUserToFlight(User user) {
        // test flight capacity
        if(users.size() >= maxUserCapacity) {
            System.out.println("Error: flight capacity limit reached. User " + user.getLname() + " " + user.getFname() +
                    " cannot be added to the flight " + getName() + "\n");
            return;
        }
        // test duplicate users
        for(Map.Entry<String, User> mapEntry : users.entrySet()) {
            if(mapEntry.getKey().equals(user.getFname()+user.getLname())) {
                System.out.println("Error: user " + user.getFname() + " " + user.getLname() + " has been already been added to this flight \n");
                return;
            }
        }
        // add the user if it passes the tests
        users.put(user.getFname()+user.getLname(), user);
        System.out.println("User " + user.getFname() + " " + user.getLname() + " has been been added to the flight " + getName() + "\n");
    }

    public void removeUserFromFlight(String key) {
        System.out.println("User " + users.get(key).getFname() + " " + users.get(key).getLname() + " has been removed from the flight " + getName() + "\n");
        users.remove(key);
    }

    public void readFlightUserList() {
        System.out.println("Flight " + getName() + " passengers list:");
        for(Map.Entry<String, User> mapEntry : users.entrySet()) {
            System.out.println(mapEntry.getValue().displayUsers());
        }
        System.out.println(" ");
    }

    public String getName() {
        return name;
    }

    public String getDestination() {
        return destination;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public int getFlightDuration() {
        return flightDuration;
    }

    public int getMaxUserCapacity() {
        return maxUserCapacity;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "name='" + name + '\'' +
                ", destination='" + destination + '\'' +
                ", departureDate=" + departureDate +
                ", flightDuration=" + flightDuration +
                ", maxUserCapacity=" + maxUserCapacity +
                '}';
    }
}

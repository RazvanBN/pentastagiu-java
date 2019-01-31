package module2.Airport;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

// Note: couldn't manage to use Streams on HashMap, so I used the basics loop like for, etc.

public class FlightManager {
    Map<String, Flight> flights = new HashMap<>();
    Map<String, User> users = new HashMap<>();

    public void addFlight(String key, Flight flight) {
        for(Map.Entry<String, Flight> mapEntry : flights.entrySet()) {
            if(mapEntry.getKey().equals(flight.getName())) {
                System.out.println("Error: flight " + flight.getName() + " has been already created\n");
                return;
            }
        }
        flights.put(flight.getName(), flight);
        System.out.println("Flight " + flight.getName() + " with the destination " + flight.getDestination() + " has been created");
    }

    public void addUser(String key, User user) {
        for(Map.Entry<String, User> mapEntry : users.entrySet()) {
            if(mapEntry.getKey().equals(user.getFname()+user.getLname())) {
                System.out.println("Error: user " + user.getFname() + " " + user.getLname() + " has been already created\n");
                return;
            }
        }
        users.put(user.getFname()+user.getLname(), user);
        System.out.println("User " + user.getFname() + " " + user.getLname() + " has been created");
    }

    public void removeFlight(String flightName) {
        System.out.println("Flight " + flightName + " has been removed" + "\n");
        flights.remove(flightName);
    }

    public void removeUser (String fname, String lname) {
        System.out.println("User " + fname + " " + lname + " has been removed" + "\n");
        users.remove(fname+lname);
    }

    public void readFlights() {
        System.out.println(flights + "\n");
    }

    public void readUsers() {
        System.out.println(users + "\n");
    }

    public void addUserToFlight(String flightName, String userFName, String userLName) {
        // test if the flight number and user are valid
        // future testing: an user can't attend in two or more active flights simultaneously
        // if the previous one isn't FINISHED.
        try {
            flights.get(flightName).addUserToFlight(users.get(userFName + userLName));
        } catch (NullPointerException e) {
            System.out.println("Error: flight number or user doesn't exist" + "\n");
        }
    }

    public void removeUserFromFlight(String flightName, String userFName, String userLName) {
        try {
            flights.get(flightName).removeUserFromFlight(userFName + userLName);
        } catch (NullPointerException e) {
            System.out.println("Error: this user doesn't exist" + "\n");
        }
    }

    public void readFlightUserList(String flightName) {
        // test if the flight number is valid
        try {
            flights.get(flightName).readFlightUserList();
        } catch (NullPointerException e) {
            System.out.println("Error: flight number doesn't exist" + "\n");
        }
    }

    public void showPassengerFlights (String fname, String lname) {
        int counter = 0;
        System.out.println("Flights that " + fname + " " + lname + " joined are:");
        for(Map.Entry<String, Flight> mapEntry : flights.entrySet()) {
            if(mapEntry.getValue().users.containsKey(fname+lname)) {
                System.out.println(mapEntry.getKey());
                counter++;
            }
            else {
                System.out.println("User " + fname + " " + lname + " it's not registered in any flight \n");
            }
        }
        System.out.println("Number of joined flights: " + counter + "\n");
    }

    public void showPassengerFlightsDestination (String fname, String lname) {
        int counter = 0;
        System.out.println("Destinations that " + fname + " " + lname + " visited are:");
        for(Map.Entry<String, Flight> mapEntry : flights.entrySet()) {
            if(mapEntry.getValue().users.containsKey(fname+lname) && mapEntry.getValue().getStatus().equals(StatusEnum.FINISHED)) {
                System.out.println(mapEntry.getValue().getDestination());
                counter++;
            }
        }
        System.out.println("Number of visited destinations: " + counter + "\n");
    }

    public void scheduledFlights () {
        int counter = 0;
        System.out.println("Scheduled flights: ");
        for(Map.Entry<String, Flight> mapEntry : flights.entrySet()) {
            if(mapEntry.getValue().getStatus().equals(StatusEnum.SCHEDULED)) {
                System.out.println(mapEntry.getKey() + ',' + mapEntry.getValue().getDestination() + ',' +
                        mapEntry.getValue().getDepartureDate() + ", Duration: " + mapEntry.getValue().getFlightDuration()/60 + " minutes.");
                counter++;
            }
        }
        System.out.println("Number of scheduled flights: " + counter + "\n");
    }

    public void finishedFlights () {
        int counter = 0;
        System.out.println("Finished flights: ");
        for(Map.Entry<String, Flight> mapEntry : flights.entrySet()) {
            if(mapEntry.getValue().getStatus().equals(StatusEnum.FINISHED)) {
                System.out.println(mapEntry.getKey() + ',' + mapEntry.getValue().getDestination() + ',' +
                        mapEntry.getValue().getDepartureDate() + ", Duration: " + mapEntry.getValue().getFlightDuration()/60 + " minutes.");
                counter++;
            }
        }
        System.out.println("Number of finished flights: " + counter + "\n");
    }

    public void updateStatusFlight() {
        System.out.println("Flights status has been updated.\n");
        for(Map.Entry<String, Flight> mapEntry : flights.entrySet()) {
            if(mapEntry.getValue().getStatus().equals(StatusEnum.SCHEDULED)) {
                Date dateTime = mapEntry.getValue().getDepartureDate();
                Date nDate = new Date(dateTime.getTime() + TimeUnit.SECONDS.toMillis(mapEntry.getValue().getFlightDuration()));
                if(nDate.getTime() < new Date().getTime()) {
                    mapEntry.getValue().setStatus(StatusEnum.FINISHED);
                }
            }
        }
    }

}

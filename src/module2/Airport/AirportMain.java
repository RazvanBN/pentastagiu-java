package module2.Airport;

public class AirportMain {
    public static void main(String[] args) {
        // Create the object which manages the flights and users
        FlightManager flightManager = new FlightManager();

        // Created three flights
        flightManager.addFlight("BOM-101", new Flight("BOM-101", "Zurich", "2019.01.21 10:11", 7200, 2, StatusEnum.SCHEDULED));
        flightManager.addFlight("BOM-102", new Flight("BOM-102", "Brasov", "2019.01.31 01:00", 3600, 2, StatusEnum.SCHEDULED));
        flightManager.addFlight("BOM-103", new Flight("BOM-103", "Toronto", "2019.03.20 01:00", 3600, 2, StatusEnum.SCHEDULED));

        // Created three users
        flightManager.addUser("BacanuRazvan", new User("Bacanu", "Razvan", "1994.05.16"));
        flightManager.addUser("JohnMilk", new User("John", "Milk", "1992.09.10"));
        flightManager.addUser("PeterPan", new User("Peter", "Pan", "1991.04.12"));

        // Display all the flights and users
        flightManager.readFlights();
        flightManager.readUsers();

        // Remove flight number BOM-101 and user John Milk
        flightManager.removeFlight("BOM-101");
        flightManager.removeUser("John", "Milk");

        // Display all the flights and users
        flightManager.readFlights();
        flightManager.readUsers();

        // Add passengers to a flight and display the list of passengers for the corresponding flight
        flightManager.addUserToFlight("BOM-102", "Bacanu", "Razvan");
        flightManager.addUserToFlight("BOM-103", "Bacanu", "Razvan");
        flightManager.addUserToFlight("BOM-102", "Peter", "Pan");
        flightManager.readFlightUserList("BOM-102");

        // Testing zone
        // 1. Flight capacity limit. Current limit: 2, so we try to add a third passenger
        flightManager.addUser("JohnMilk", new User("John", "Milk", "1992.09.10"));
        flightManager.addUserToFlight("BOM-102", "John", "Milk");

        // 2. Flight unique name. We add another flight with the same name
        flightManager.addFlight("BOM-102", new Flight("BOM-102", "Brasov", "2019.01.31 01:00", 3600, 2, StatusEnum.SCHEDULED));

        // 3. Unique users. We add the same user twice
        flightManager.addUser("JohnMilk", new User("John", "Milk", "1992.09.10"));
        // End of testing zone

        // Remove a passenger from a flight and display the list of current passengers
        flightManager.removeUserFromFlight("BOM-102", "Peter", "Pan");
        flightManager.readFlightUserList("BOM-102");

        // Show the flights that the given user has attended
        flightManager.showPassengerFlights("Bacanu", "Razvan");

        // Show the destinations that the given user has visited
        flightManager.showPassengerFlightsDestination("Bacanu", "Razvan");

        // Display all scheduled flights
        flightManager.scheduledFlights();

        // Display all finished flights
        flightManager.finishedFlights();

        // Update flights based on departureDate and flightDuration
        flightManager.updateStatusFlight();

        // Display all finished flights
        flightManager.finishedFlights();

        // Show the flights that the given user has attended after updating the flights
        flightManager.showPassengerFlights("Bacanu", "Razvan");

        // Show the destinations that the given user has visited after updating the flights
        flightManager.showPassengerFlightsDestination("Bacanu", "Razvan");

    }
}

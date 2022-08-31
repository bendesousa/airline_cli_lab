import java.util.ArrayList;
import java.util.Scanner;

public class Airline {

    private String name;
    private ArrayList<Flight> flightList;

    public Airline (String name){
        this.name = name;
        this.flightList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }

    public void addFlight (Flight flight){
        this.flightList.add(flight);
    }

    public String cancelFlight (Flight flight){
        this.flightList.remove(flight);
        return "This flight has been cancelled.";
    }

    public String bookFlight(Flight flight){
        Scanner reader = new Scanner(System.in);
        System.out.println("Please type in your name and mobile number (spilt by a space): ");

        String input = reader.nextLine();
        String[] passengerDetail = input.split(" ");

        String passengerName = passengerDetail[0];
        int passengerMobileNumber = Integer.parseInt(passengerDetail[1]);

        Passenger passenger = new Passenger(passengerName, passengerMobileNumber);

        flight.addPassenger(passenger);

        return passengerName + "has been booked onto the flight.";
    }
}

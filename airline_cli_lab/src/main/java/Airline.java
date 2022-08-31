import java.io.ByteArrayInputStream;
import java.io.InputStream;
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

    public void addFlight (){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type in the flight destination and id (split by a space): ");

        String input = reader.nextLine();
        String[] flightDetail = input.split(" ");

        String destination = flightDetail[0];
        String id = flightDetail[1];
        Flight flight = new Flight(destination, id);
        this.flightList.add(flight);
    }

    public String cancelFlight (){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type in the flight id: ");

        String id = reader.nextLine();

        for(Flight flight : flightList){
            if(id.equals(flight.getId())){
                this.flightList.remove(flight);
                break;
            }
        }

        return "This flight has been cancelled.";
    }

    public String bookFlight(Flight flight){
        Scanner reader = new Scanner(System.in);
        System.out.println("Please type in your name and mobile number (split by a space): ");

        String input = reader.nextLine();
        String[] passengerDetail = input.split(" ");

        String passengerName = passengerDetail[0];
        int passengerMobileNumber = Integer.parseInt(passengerDetail[1]);

        Passenger passenger = new Passenger(passengerName, passengerMobileNumber);

        flight.addPassenger(passenger);

        return passengerName + " has been booked onto the flight.";
    }

    public void displayFlights(){
        for (Flight flight : flightList){
            System.out.println(flight.toString());
        }
    }

}

import java.util.ArrayList;
import java.util.Scanner;

public class Flight {

    private String destination;
    private String id;
    private ArrayList<Passenger> passengerList;

    public Flight (String destination, String id){
        this.destination = destination;
        this.id = id;
        this.passengerList = new ArrayList<>();
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setPassengerList(ArrayList<Passenger> passengerList) {
        this.passengerList = passengerList;
    }

    public ArrayList<Passenger> getPassengerList() {
        return passengerList;
    }

    public void addPassenger() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please type in your name and mobile number");

        String passengerName = reader.nextLine();
        int passengerMobileNumber = reader.nextInt();

        Passenger passenger = new Passenger(passengerName, passengerMobileNumber);
        passengerList.add(passenger);

    }

    @Override
    public String toString(){
        return "Flight{" + "destination='" + this.destination +
                "', id='" + this.id + "'}";
    }
    
}



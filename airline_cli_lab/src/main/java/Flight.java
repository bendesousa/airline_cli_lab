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

    public void addPassenger(Passenger passenger) {
        
        passengerList.add(passenger);

    }

    public int countPassengerList(){
        return this.passengerList.size();
    }

    @Override
    public String toString(){
        return "Flight{" + "destination='" + this.destination +
                "', id='" + this.id + "'}";
    }

}



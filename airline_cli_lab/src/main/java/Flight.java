import java.util.ArrayList;

public class Flight {

    private String destination;
    private String id;
    private ArrayList<Passenger> passengerList;

    public Flight (String destination, String id){
        this.destination = destination;
        this.id = id;
    }
}

import java.util.ArrayList;

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
}

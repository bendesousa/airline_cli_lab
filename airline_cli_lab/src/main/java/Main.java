public class Main {

    public static void main(String[] args) {

        Airline airline = new Airline("BNA");
        Flight flight_hk = new Flight("Hong Kong", "A123");
        Flight flight_seattle = new Flight("Seattle", "A988");

        airline.addFlight(flight_hk);
        airline.addFlight(flight_seattle);

        String bookedFlight = airline.bookFlight(flight_hk);
        System.out.println(bookedFlight);
    }
}
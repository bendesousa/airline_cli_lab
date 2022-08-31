import java.util.Scanner;

public class Option {

    public static void chooseOption(Airline airline){
        Scanner reader = new Scanner(System.in);
        System.out.println("Available option: search, addFlight, cancelFlight, displayFlight, bookFlight");

        String chosenOption = reader.nextLine();

        switch (chosenOption){
            case "search":
                SearchFunction.searchFlightDestination(airline.getFlightList());
                break;
            case "addFlight":
                airline.addFlight();
                break;
            case "cancelFlight":
                airline.cancelFlight();
                break;
            case "displayFlight":
                airline.displayFlights();
                break;
            case "bookFlight":
                airline.bookFlight(flight);
                break;
        }
    }
}

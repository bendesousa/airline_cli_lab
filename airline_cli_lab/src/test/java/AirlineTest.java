import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirlineTest {

    private Airline airline;
    private  Flight flight;
    private Flight flight1;

    @BeforeEach
    public void setUp(){
        this.airline = new Airline("BNA");
        this.flight = new Flight("Hong Kong", "12345");
        this.flight1 = new Flight("Seattle", "09876");
    }
    
    @Test
    public void canAddFlight(){
        this.airline.addFlight(flight);
        int actual = airline.getFlightList().size();
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void canAddMultipleFlights(){
        this.airline.addFlight(flight1);
        this.airline.addFlight(flight);
        int actual = airline.getFlightList().size();
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test
    public void canCancelFlight(){
        this.airline.addFlight(flight);
        this.airline.cancelFlight(flight);
        int actual = airline.getFlightList().size();
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void canCancelMultipleFlights(){
        this.airline.addFlight(flight);
        this.airline.addFlight(flight1);
        this.airline.cancelFlight(flight);
        this.airline.cancelFlight(flight1);
        int actual = airline.getFlightList().size();
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void canBookFlight(){
        String inputName = "John 12345";
        InputStream in = new ByteArrayInputStream(inputName.getBytes());
        System.setIn(in);
        this.airline.bookFlight(flight);
        int actual = flight.countPassengerList();
        int expected = 1;
        assertEquals(actual, expected);
    }



}

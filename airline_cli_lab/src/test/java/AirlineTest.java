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
        String inputName = "Seattle 12345";
        InputStream in = new ByteArrayInputStream(inputName.getBytes());
        System.setIn(in);
        this.airline.addFlight();
        int actual = airline.getFlightList().size();
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void canAddMultipleFlights(){
        String inputName = "Seattle 12345";
        InputStream in = new ByteArrayInputStream(inputName.getBytes());
        System.setIn(in);
        this.airline.addFlight();
        String input = "Seattle 12345";
        InputStream in_1 = new ByteArrayInputStream(input.getBytes());
        System.setIn(in_1);
        this.airline.addFlight();
        int actual = airline.getFlightList().size();
        int expected = 2;
        assertEquals(actual, expected);
    }

    @Test
    public void canCancelFlight(){
        String inputDetail = "Seattle 12345";
        InputStream in = new ByteArrayInputStream(inputDetail.getBytes());
        System.setIn(in);
        this.airline.addFlight();
        String input = "12345";
        InputStream in_1 = new ByteArrayInputStream(input.getBytes());
        System.setIn(in_1);
        this.airline.cancelFlight();
        int actual = airline.getFlightList().size();
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void canCancelMultipleFlights(){
        String inputDetail_1 = "Seattle 12345";
        InputStream in_1 = new ByteArrayInputStream(inputDetail_1.getBytes());
        System.setIn(in_1);
        this.airline.addFlight();
        String inputDetail_2 = "HongKong 67893";
        InputStream in_2 = new ByteArrayInputStream(inputDetail_2.getBytes());
        System.setIn(in_2);
        this.airline.addFlight();
        String input = "12345";
        InputStream in_3 = new ByteArrayInputStream(input.getBytes());
        System.setIn(in_3);
        this.airline.cancelFlight();
        String input_0 = "67893";
        InputStream in_4 = new ByteArrayInputStream(input_0.getBytes());
        System.setIn(in_4);
        this.airline.cancelFlight();
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

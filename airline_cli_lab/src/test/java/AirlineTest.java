import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirlineTest {

    private Airline airline;
    private  Flight flight;

    @BeforeEach
    public void setUp(){
        this.airline = new Airline("BNA");
        this.flight = new Flight("Hong Kong", "12345");
    }
    
    @Test
    public void canAddFlight(){
        this.airline.addFlight(flight);
        int actual = airline.getFlightList().size();
        int expected = 1;
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
}

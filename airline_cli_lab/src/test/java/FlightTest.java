import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlightTest {

    private Flight flight;

    @BeforeEach
    public void setup(){
        flight = new Flight("Hong Kong", "A123");
    }

    @Test
    public void test(){
        String actual = flight.getId();
        String expected = "A123";
        assertEquals(actual, expected);
    }

    @Test
    public void passengerList_start(){
        int actual = flight.countPassengerList();
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void canAddPassenger(){
        flight.addPassenger();
        int actual = flight.countPassengerList();
        int expected = 1;
        assertEquals(actual, expected);
    }

}

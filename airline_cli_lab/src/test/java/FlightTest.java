import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

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
        String inputName = "John 12345";
        InputStream in = new ByteArrayInputStream(inputName.getBytes());
        System.setIn(in);
        flight.addPassenger(new Passenger("John", 12345));
        int actual = flight.countPassengerList();
        int expected = 1;
        assertEquals(actual, expected);
    }

}

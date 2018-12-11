package travelofficepackage;

import org.junit.BeforeClass;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class DomesticTripTest {

    private Trip trip;


    @Test
    public void getPrice() {

        trip = new DomesticTrip(Date.setDate("2018-08-10", "-"), Date.setDate("2017-8-15", "-"), "Egipt", new BigDecimal(100), new BigDecimal(10));
        trip = (Trip) trip;
        DomesticTrip trip1 = (DomesticTrip) trip;
        BigDecimal check;
        check = trip.getPrice();
        assertEquals(check, trip1.getPrice());
    }
}
package travelofficepackage;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.util.reflection.FieldSetter;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.ByteArrayOutputStream;
import java.math.BigDecimal;
import java.util.HashSet;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
@RunWith(MockitoJUnitRunner.class)
public class TravelOfficeTest {


    static Customer customer;

    static TravelOffice traveloffice;

    static Trip trip;
@BeforeClass
public static void createTravelOffice()
{
    traveloffice = new TravelOffice();
}
@BeforeClass
public static void createTrip()
{
    trip = new DomesticTrip(Date.setDate("2018-08-10","-"),Date.setDate("2017-8-15","-"), "Egipt", new BigDecimal(100), new BigDecimal(10));

}
    @BeforeClass
    public static void createCustomer()
    {
        customer = new Customer("Anonimowy");
    }
    @Test
    public void addCustomer() throws NoSuchFieldException {
        int checkSizeBeforeAdd = traveloffice.getCustomerCount();
        assertTrue(checkSizeBeforeAdd==0);
        traveloffice.addCustomer(customer);
        int checkSizeAfterAdd = traveloffice.getCustomerCount();
        assertTrue(checkSizeAfterAdd==1);

    }

    @Test
    public void addTrip() {

        int checkSizeBeforeAdd = traveloffice.getTripCount();
        assertTrue(checkSizeBeforeAdd==0);
        traveloffice.addTrip("00",trip);
        int checkSizeAfterAdd = traveloffice.getTripCount();
        assertTrue(checkSizeAfterAdd==1);

    }

    @Test
    public void removeTrip() {
        int checkSizeBeforeAdd = traveloffice.getTripCount();
        assertTrue(checkSizeBeforeAdd==0);
        traveloffice.addTrip("00",trip);
        int checkSizeAfterAdd = traveloffice.getTripCount();
        assertTrue(checkSizeAfterAdd==1);
        traveloffice.removeCustomer(customer);
        assertTrue(traveloffice.getCustomerCount()==0);

    }

    @Test
    public void findCustomerByName() {
        traveloffice.addCustomer(customer);
        assertEquals(customer,traveloffice.findCustomerByName("Anonimowy"));
    }

    @Test
    public void removeCustomer() {
        traveloffice.addCustomer(customer);
        assertEquals(customer,traveloffice.findCustomerByName("Anonimowy"));
        traveloffice.removeCustomer(customer);
        assertTrue(traveloffice.getCustomerCount()==0);
    }

    @Test
    public void getCustomerCount() {
    }

    @Test
    public void showCustomers() {
    }

    @Test
    public void showTrip() {
    }
}
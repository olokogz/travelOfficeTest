package travelofficepackage;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;



public class DateTest {
    private Date date;

    @Test
    public void setDate()
    {
        date = Date.setDate("2010-10-10","-");
        assertEquals(" Rok: 2010 Miesiac: 10 Dzien: 10",date.toString());
    }

}
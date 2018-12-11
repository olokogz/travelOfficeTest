package travelofficepackage;

import java.math.BigDecimal;

public abstract class Trip {

    private Date start;
    private Date end;
    private String destination;
    private BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }



    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Trip(Date start, Date end, String destination, BigDecimal price)
    {
        setDestination(destination);
        setEnd(end);
        setStart(start);
        setPrice(price);
    }
    public Trip(String start, String end,String parse, String destination, BigDecimal price)
    {
        setStart(Date.setDate(start,parse));
        setEnd(Date.setDate(end,parse));
        setDestination(destination);
        setPrice(price);
    }


    @Override
    public String toString() {
        return " Start wycieczki: " + start +
                ", Koniec wycieczki: " + end +
                ", Cel podrozy: " + destination + '\'' +
                ", Koszt podróży: "+getPrice()+
                '}';
    }
}

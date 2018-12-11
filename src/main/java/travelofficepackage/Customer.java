package travelofficepackage;

import java.util.Objects;

public class Customer {

    private String name;
    private Address address;
    private Trip trip;

    public Customer() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Customer(String name)
    {
        setName(name);
    }

    /*public String getiInfo()
    {
        return "Imie klienta: "+name
                +address.getInfo()
                +trip.getInfo();
    }*/

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Imie klienta: ");
        sb.append(name);
        sb.append(address.toString());
        sb.append(trip.toString());
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) &&
                Objects.equals(address, customer.address) &&
                Objects.equals(trip, customer.trip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, trip);
    }
}

package travelofficepackage;

import java.math.BigDecimal;


public class Test {

    public static void main(String[] args) {
        // utworz biuro podrozy
        TravelOffice to = new TravelOffice();
        Trip trip;
        // budujemy wycieczke

        Trip dt = new DomesticTrip(Date.setDate("2018-08-10","-"),Date.setDate("2017-8-15","-"), "Egipt", new BigDecimal(100), new BigDecimal(10));
        to.addTrip("0000",dt);
        Trip at = new AbroadTrip(Date.setDate("2018-5-2","-"),Date.setDate("2018-10-21","-"), "Warsaw", new BigDecimal(100), new BigDecimal(50));
        to.addTrip("0001",at);

        // budujemy pierwszego klienta
        Customer customer = new Customer("Jan Kowalski");
        customer.setAddress(new Address("Marszalkowska 10", "00-876", "Warszawa"));
        customer.setTrip(dt);
        to.addCustomer(customer); // dodajemy go do biura


        customer = new Customer("Jozef Nowak");
        customer.setAddress(new Address("Al. Jerozolimskie 120", "00-345", "Warszawa"));
        customer.setTrip(at);
        to.addCustomer(customer); // dodajemy go do biura

        customer = new Customer("Jaroslaw Lis");
        customer.setAddress(new Address("Swietokrzyska 14", "00-666", "Warszawa"));
        customer.setTrip(dt);
        to.addCustomer(customer); // dodajemy go do biura

        //System.out.println(to.toString());

        //travelofficepackage.Customer cust = to.findCustomerByName("Jan Kowalski");
        //to.removeCustomer(cust);
        //System.out.println(to.toString());
        to.showTrip();




    }
}

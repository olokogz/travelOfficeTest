package travelofficepackage;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TravelOffice {

    //private travelofficepackage.Customer[] customers = new travelofficepackage.Customer[2];
    private HashSet<Customer> customers = new HashSet<>();
    private Map<String, Trip> tripMap = new HashMap<>();
    private int customerCount=0;


    public void addCustomer(Customer customer)
    {

        /*if (customerCount == customers.length) {
            travelofficepackage.Customer temp[] = new travelofficepackage.Customer[customers.length + 2];
            System.arraycopy(customers, 0, temp, 0, customers.length);
            customers = temp;
        }
        customers[customerCount++] = customer;*/
        customers.add(customer);

    }
    public void addTrip(String key, Trip value)
    {
        tripMap.put(key,value);
    }
    public boolean removeTrip(String key)

    {
        if(tripMap.get(key).equals(key))
        {
            tripMap.remove(tripMap.get(key));
            return true;
        }
        else return false;
    }
    public Customer findCustomerByName(String value)
    {
        /*Iterator<travelofficepackage.Customer> iterator = customers.iterator();
        travelofficepackage.Customer temp = new travelofficepackage.Customer("")
        while (iterator.hasNext())
        {   temp=iterator.next();
            if(temp.getName().equals(value))
            {
                return temp;
            }
            else

                return null;

        }*/

        /*
        ;
        for(travelofficepackage.Customer hashset : customers)
        {
            if(hashset.getName().equals(value))
                temp=hashset;
        }
        return temp;*/
        Stream<Customer> stream = customers.stream();
        List<Customer> collect = stream.filter(x -> x.getName().equals(value)).collect(Collectors.toList());

        return collect.get(0);


    }
    public boolean removeCustomer(Customer customer)
    {
        customers.remove(customer);
        return true;
    }


    public int getCustomerCount()
    {
        return customers.size();
    }
    public int getTripCount(){ return tripMap.size(); }
    /*public String getInfo()
    {
        StringBuilder sb = new StringBuilder();
       for(int i=0;i<customerCout;i++)
       {

               sb.append(tab[i].getiInfo());
               sb.append("\n");

       }
        return sb.toString();

        String report = "";
        for (int i = 0; i < customerCount; i++) {
            report += customers[i].getiInfo() + "\n";
        }
        return report;

        }
     */
   public void showCustomers()
   {
       /*StringBuilder sb = new StringBuilder();
        for(travelofficepackage.Customer c : customers)
            System.out.println(c.toString());
        */
        customers.stream().forEach(System.out::println);
   }
    public void showTrip()
    {
        tripMap.values().stream().forEach(System.out::println);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TravelOffice that = (TravelOffice) o;
        return customerCount == that.customerCount &&
                customers.equals(that.customers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customers);
    }

    @Override
    public String toString() {
        /*return "travelofficepackage.TravelOffice{" +
                "customers=" + Arrays.toString(customers) +
                ", customerCount=" + customerCount +
                '}';

        StringBuilder sb = new StringBuilder();
        sb.append(" Klient: ");
        sb.append(Arrays.toString(customers));
        return sb.toString();*/
        /*StringBuilder sb = new StringBuilder();
        for(int i=0;i<customers.length-1;i++)
        {
            sb.append(customers[i].toString()+"\n");
        }
            return sb.toString();*/
        /*StringBuilder sb = new StringBuilder();
        for(travelofficepackage.Customer hashset : customers)
        {
            sb.append("Klient: ");
            sb.append(customers.toString()+"\n");
        }
        return sb.toString();
        */
        StringBuilder sb = new StringBuilder();
        Iterator<Customer> it = customers.iterator();
        while(it.hasNext())
        {
            sb.append(it.next()+"\n");
        }
        return sb.toString();

    }


}




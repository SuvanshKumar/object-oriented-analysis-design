package src;

import java.util.Enumeration;
import java.util.Vector;
import java.util.concurrent.ConcurrentNavigableMap;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();
    
    public Customer (String name) {
        _name = name;
    }
    
    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }
    
    public String getName() {
        return _name;
    }

    public Vector getRentals() {
        return _rentals;
    }
    
    public String printStatement() {
        double totalAmount = 0;
        int         frequentRenterPoints = 0;
        Enumeration rentals              = _rentals.elements();
        StringBuilder resultBuilder = new StringBuilder("Rental Record for " + getName() + "\n");

        while (rentals.hasMoreElements()) {
            Rental thisRental = (Rental) rentals.nextElement();
            totalAmount += thisRental.getAmount();
            frequentRenterPoints += thisRental.getFrequentPoints();
            resultBuilder.append(thisRental.getSummary());
        }

        resultBuilder.append("Amount owed is " + String.valueOf(totalAmount) + "\n");
        resultBuilder.append("You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points");
        return resultBuilder.toString();
    }
}
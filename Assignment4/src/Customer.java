import java.util.Enumeration;
import java.util.Vector;

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
    
    public String printStatement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        StringBuilder resultBuilder = new StringBuilder("Rental Record for " + getName() + "\n");
        
        while (rentals.hasMoreElements()) {
            Rental thisRental = (Rental) rentals.nextElement();
            totalAmount += thisRental.getRentalPrice();
            frequentRenterPoints += thisRental.getFrequentRenterPoints();
            resultBuilder.append(thisRental.getSummary());
        }

        resultBuilder.append("Amount owed is ").append(totalAmount).append("\n");
        resultBuilder.append("You earned ").append(frequentRenterPoints).append(" frequent renter points");
        return resultBuilder.toString();

    }
}
import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private int _age;
    private Vector _rentals = new Vector();
    
    public Customer (String name, int age) {
        _name = name;
        _age = age;
    }
    
    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public Vector<Rental> getRental() { return _rentals; }
    
    public String getName() {
        return _name;
    }

    public int getAge() {
        return _age;
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
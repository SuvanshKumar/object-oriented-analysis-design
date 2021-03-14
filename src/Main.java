package src;

import src.Movie;
import src.Rental;
import src.Customer;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new RegularMovie("Iron Man");
        Movie movie2 = new ChildrensMovie("Doraemon");
        Movie movie3 = new NewReleaseMovie("Hobbs and Shaw");

        Rental rental1 = new Rental(movie1, 5);
        Rental rental2 = new Rental(movie1, 8);
        Rental rental3 = new Rental(movie1, 2);
        Rental rental4 = new Rental(movie2, 3);
        Rental rental5 = new Rental(movie2, 10);
        Rental rental6 = new Rental(movie2, 15);
        Rental rental7 = new Rental(movie3, 7);
        Rental rental8 = new Rental(movie3, 4);
        Rental rental9 = new Rental(movie3, 1);
        Rental rental10 = new Rental(movie3, 9);

        Customer customer1 = new Customer("Tony Stark");
        Customer customer2 = new Customer("Dominic Toretto");
        Customer customer3 = new Customer("Tommy Vercetti");
        Customer customer4 = new Customer("Carl Johnson");
        Customer customer5 = new Customer("Mike Toreno");

        customer1.addRental(rental1);
        customer1.addRental(rental7);

        customer2.addRental(rental5);
        customer2.addRental(rental10);

        customer3.addRental(rental2);
        customer3.addRental(rental8);
        customer3.addRental(rental5);

        customer4.addRental(rental3);
        customer4.addRental(rental6);

        customer5.addRental(rental4);
        customer5.addRental(rental9);

        Customer[] customers = {customer1, customer2, customer3, customer4, customer5};

        for (int i=0; i < customers.length; i++) {
            System.out.println("Statement for Customer " + (i+1) + ":\n");
            System.out.println(customers[i].printStatement());
            System.out.println("\nXML statement for Customer " + (i+1) + ":\n");
            System.out.println(customers[i].printXMLStatement());
            System.out.println();
        }
    }
}

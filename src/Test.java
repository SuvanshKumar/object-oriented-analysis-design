package src;

import src.Movie;
import src.Rental;
import src.Customer;

public class Test {
    public static void main(String[] args) {
        Movie movie1 = new RegularMovie("Iron Man");
        Movie movie2 = new ChildrensMovie("Doraemon");
        Movie movie3 = new NewReleaseMovie("Fast and Furious 9");

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

        Customer customer1 = new Customer("Person1");
        Customer customer2 = new Customer("Person2");
        Customer customer3 = new Customer("Person3");
        Customer customer4 = new Customer("Person4");
        Customer customer5 = new Customer("Person5");

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

        System.out.println("Done");
    }
}

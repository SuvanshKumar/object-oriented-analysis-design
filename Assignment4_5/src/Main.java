import jdk.jfr.Unsigned;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Iron Man", Movie.REGULAR);
        Movie movie2 = new Movie("Doraemon", Movie.CHILDRENS);
        Movie movie3 = new Movie("Hobbs and Shaw", Movie.NEW_RELEASE);

        Rental rental1 = new Rental(movie1, 5, new RegularRentalPriceStrategy(), new RegularFrequentRenterPointsStrategy());
        Rental rental2 = new Rental(movie1, 8, new RegularRentalPriceStrategy(), new RegularFrequentRenterPointsStrategy());
        Rental rental3 = new Rental(movie1, 2, new RegularRentalPriceStrategy(), new RegularFrequentRenterPointsStrategy());
        Rental rental4 = new Rental(movie2, 2, new ChildrenRentalPriceStrategy(), new ChildrenFrequentRenterPointsStrategy());
        Rental rental5 = new Rental(movie2, 10, new ChildrenRentalPriceStrategy(), new ChildrenFrequentRenterPointsStrategy());
        Rental rental6 = new Rental(movie2, 15, new ChildrenRentalPriceStrategy(), new ChildrenFrequentRenterPointsStrategy());
        Rental rental7 = new Rental(movie3, 7, new NewReleaseRentalPriceStrategy(), new NewReleaseFrequentRenterPointsStrategy());
        Rental rental8 = new Rental(movie3, 4, new NewReleaseRentalPriceStrategy(), new NewReleaseFrequentRenterPointsStrategy());
        Rental rental9 = new Rental(movie3, 1, new NewReleaseRentalPriceStrategy(), new NewReleaseFrequentRenterPointsStrategy());
        Rental rental10 = new Rental(movie3, 9, new NewReleaseRentalPriceStrategy(), new NewReleaseFrequentRenterPointsStrategy());

        String[] customerNames = {"Tony Stark", "Tommy Vercetti", "Carl Johnson"};
        int[] customerAges = {47, 52, 21};

        Customer[] customers = new Customer[customerNames.length];
        for (int i = 0; i < customers.length; i++) {
            customers[i] = new Customer(customerNames[i], customerAges[i]);
        }

        customers[0].addRental(rental1);
        customers[0].addRental(rental7);

        customers[1].addRental(rental2);
        customers[1].addRental(rental8);
        customers[1].addRental(rental5);

        customers[2].addRental(rental4);
        customers[2].addRental(rental9);
        customers[2].addRental(rental10);

        for (int i=0; i < customers.length; i++) {
            HashSet<Integer> rentedMovieTypes = new HashSet<>();
            int newReleaseMovieRentedCount = 0, frequentRenterPoints = 0;
            boolean isYoungAdultModificationDone = false, isMultipleMovieTypeModificationDone = false;
            System.out.print("Frequent renter points for Customer " + (i+1) + ": ");
            for (Rental rental: customers[i].getRental()) {
                int thisFrequentRenterPoints = rental.getFrequentRenterPoints();
                if (!isMultipleMovieTypeModificationDone) {
                    rentedMovieTypes.add(rental.getMovie().getPriceCode());
                    if (rentedMovieTypes.size() > 2) {
                        thisFrequentRenterPoints = new MultipleMovieTypeFrequentRenterPointsStrategy().getUpdatedFrequentRenterPoints(thisFrequentRenterPoints);
                        isMultipleMovieTypeModificationDone = true;
                    }
                }
                if (!isYoungAdultModificationDone) {
                    if (rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) {
                        newReleaseMovieRentedCount++;
                    }
                    if (newReleaseMovieRentedCount >= 1 && isCustomerYoungAdult(customers[i])) {
                        thisFrequentRenterPoints = new YoungAdultFrequentRenterPointsStrategy().getUpdatedFrequentRenterPoints(thisFrequentRenterPoints);
                        isYoungAdultModificationDone = true;
                    }
                }
                frequentRenterPoints += thisFrequentRenterPoints;
            }

            System.out.println(frequentRenterPoints);
        }
    }

    private static boolean isCustomerYoungAdult(Customer customer) {
        return (customer.getAge() >= 18 && customer.getAge() <= 22);
    }
}

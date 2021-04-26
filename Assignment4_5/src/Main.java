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

        String[] customerNames = {"Tony Stark", "Dominic Toretto", "Tommy Vercetti", "Carl Johnson", "Mike Toreno"};

        Customer[] customers = new Customer[customerNames.length];
        for (int i = 0; i < customerNames.length; i++) {
            customers[i] = new Customer(customerNames[i]);
        }

        customers[0].addRental(rental1);
        customers[0].addRental(rental7);

        customers[1].addRental(rental5);
        customers[1].addRental(rental10);

        customers[2].addRental(rental2);
        customers[2].addRental(rental8);
        customers[2].addRental(rental5);

        customers[3].addRental(rental3);
        customers[3].addRental(rental6);

        customers[4].addRental(rental4);
        customers[4].addRental(rental9);

        for (int i=0; i < customers.length; i++) {
            System.out.println("Statement for Customer " + (i+1) + ":\n");
            System.out.println(customers[i].printStatement());
            System.out.println();
        }
    }
}

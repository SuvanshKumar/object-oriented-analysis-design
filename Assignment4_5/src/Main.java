import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new RegularMovie("Iron Man");
        Movie movie2 = new ChildrensMovie("Doraemon");
        Movie movie3 = new NewReleaseMovie("Hobbs and Shaw");

        VideoGame game1 = new ActionVideoGame("GTA San Andreas");
        VideoGame game2 = new ActionVideoGame("GTA Vice City");
        VideoGame game3 = new RTSVideoGame("Rise of Nations");
        VideoGame game4 = new RacingVideoGame("Midtown Madness");

        Popcorn popcorn1 = new CheesePopcorn("Large packet");
        Popcorn popcorn2 = new ChocolatePopcorn("Large packet");

        TransactionItem transactionItem1 = new Rental(movie1, 5, new RegularMovieRentalPriceStrategy(), new RegularMovieFrequentRenterPointsStrategy());
        TransactionItem transactionItem2 = new Purchase(movie2, new ChildrensMoviePurchasePriceStrategy(), new ChildrensMoviePurchaseRewardPointsStrategy());
        TransactionItem transactionItem3 = new Rental(game3, 10, new RTSVideoGameRentalPriceStrategy(), new RTSVideoGameFrequentRenterPointsStrategy());

        TransactionItem transactionItem4 = new Purchase(game2, new ActionVideoGamePurchasePriceStrategy(), new ActionVideoGamePurchaseRewardPointsStrategy());
        TransactionItem transactionItem5 = new Rental(game4, 2, new RacingVideoGameRentalPriceStrategy(), new RacingVideoGameFrequentRenterPointsStrategy());
        TransactionItem transactionItem6 = new Purchase(popcorn1, new CheesePopcornPurchasePriceStrategy(), new CheesePopcornPurchaseRewardPointsStrategy());

        TransactionItem transactionItem7 = new Purchase(game1, new ActionVideoGamePurchasePriceStrategy(), new ActionVideoGamePurchaseRewardPointsStrategy());
        TransactionItem transactionItem8 = new Rental(game4, 5, new RacingVideoGameRentalPriceStrategy(), new RacingVideoGameFrequentRenterPointsStrategy());
        TransactionItem transactionItem9 = new Purchase(popcorn1, new CheesePopcornPurchasePriceStrategy(), new CheesePopcornPurchaseRewardPointsStrategy());

        TransactionItem transactionItem10 = new Purchase(movie3, new NewReleaseMoviePurchasePriceStrategy(), new NewReleaseMoviePurchaseRewardPointsStrategy());
        TransactionItem transactionItem11 = new Purchase(game4, new RacingVideoGamePurchasePriceStrategy(), new RacingVideoGamePurchaseRewardPointsStrategy());
        TransactionItem transactionItem12 = new Purchase(popcorn2, new ChocolatePopcornPurchasePriceStrategy(), new ChocolatePopcornPurchaseRewardPointsStrategy());

        Transaction transaction1 = new Transaction();
        transaction1.addTransactionItem(transactionItem1);
        transaction1.addTransactionItem(transactionItem2);
        transaction1.addTransactionItem(transactionItem3);

        Transaction transaction2 = new Transaction();
        transaction2.addTransactionItem(transactionItem4);
        transaction2.addTransactionItem(transactionItem5);
        transaction2.addTransactionItem(transactionItem6);

        Transaction transaction3 = new Transaction();
        transaction3.addTransactionItem(transactionItem7);
        transaction3.addTransactionItem(transactionItem8);
        transaction3.addTransactionItem(transactionItem9);

        Transaction transaction4 = new Transaction();
        transaction4.addTransactionItem(transactionItem10);
        transaction4.addTransactionItem(transactionItem11);
        transaction4.addTransactionItem(transactionItem12);

        String[] customerNames = {"Tony Stark", "Tommy Vercetti", "Carl Johnson", "Dominic Toretto"};
        int[] customerAges = {47, 52, 21, 55};

        Customer[] customers = new Customer[Math.min(customerNames.length, customerAges.length)];
        for (int i = 0; i < customers.length; i++) {
            customers[i] = new Customer(customerNames[i], customerAges[i]);
        }

        customers[0].addTransaction(transaction1);
        customers[1].addTransaction(transaction2);
        customers[2].addTransaction(transaction3);
        customers[3].addTransaction(transaction4);

        for (Customer customer: customers) {
            System.out.println(customers[0].printStatement());
            System.out.println(customers[1].printStatement());
            System.out.println(customers[2].printStatement());
            System.out.println(customers[3].printStatement());
        }
    }

    private static boolean isCustomerYoungAdult(Customer customer) {
        return (customer.getAge() >= 18 && customer.getAge() <= 22);
    }
}

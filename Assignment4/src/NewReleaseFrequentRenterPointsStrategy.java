public class NewReleaseFrequentRenterPointsStrategy extends FrequentRenterPointsStrategy {

    NewReleaseFrequentRenterPointsStrategy() {
        this.frequentRenterPoints = 1;
    }

    @Override
    public int computeFrequentRenterPoints(Rental rental) {
        if (rental.getMovie().getPriceCode() == Movie.NEW_RELEASE && rental.getDaysRented() > 1) {
            this.frequentRenterPoints ++;
        }
        return this.frequentRenterPoints;
    }
}

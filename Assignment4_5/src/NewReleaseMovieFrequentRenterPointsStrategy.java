public class NewReleaseMovieFrequentRenterPointsStrategy extends FrequentRenterPointsStrategy {

    NewReleaseMovieFrequentRenterPointsStrategy() {
        this.frequentRenterPoints = 1;
    }

    @Override
    public int computeFrequentRenterPoints(Rental rental) {
        if (rental.getItem().getPriceCode() == Movie.NEW_RELEASE && rental.getDaysRented() > 1) {
            this.frequentRenterPoints ++;
        }
        return this.frequentRenterPoints;
    }
}

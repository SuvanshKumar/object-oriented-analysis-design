public class RegularMovieFrequentRenterPointsStrategy extends FrequentRenterPointsStrategy {
    RegularMovieFrequentRenterPointsStrategy() {
        this.frequentRenterPoints = 1;
    }

    @Override
    public int computeFrequentRenterPoints(Rental rental) {
        return this.frequentRenterPoints;
    }
}

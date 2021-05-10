public class ChildrensMovieFrequentRenterPointsStrategy extends FrequentRenterPointsStrategy{
    ChildrensMovieFrequentRenterPointsStrategy() {
        this.frequentRenterPoints = 1;
    }

    @Override
    public int computeFrequentRenterPoints(Rental rental) {
        return this.frequentRenterPoints;
    }
}

public class RacingVideoGameFrequentRenterPointsStrategy extends FrequentRenterPointsStrategy {
    RacingVideoGameFrequentRenterPointsStrategy() {
        this.frequentRenterPoints = 1;
    }

    @Override
    public int computeFrequentRenterPoints(Rental rental) {
        return this.frequentRenterPoints;
    }
}

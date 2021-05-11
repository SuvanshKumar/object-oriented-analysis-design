public class RTSVideoGameFrequentRenterPointsStrategy extends FrequentRenterPointsStrategy {
    RTSVideoGameFrequentRenterPointsStrategy() {
        this.frequentRenterPoints = 1;
    }

    @Override
    public int computeFrequentRenterPoints(Rental rental) {
        return this.frequentRenterPoints;
    }
}

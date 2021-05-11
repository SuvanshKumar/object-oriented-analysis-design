public class ActionVideoGameFrequentRenterPointsStrategy extends FrequentRenterPointsStrategy {
    ActionVideoGameFrequentRenterPointsStrategy() {
        this.frequentRenterPoints = 1;
    }

    @Override
    public int computeFrequentRenterPoints(Rental rental) {
        return this.frequentRenterPoints;
    }
}

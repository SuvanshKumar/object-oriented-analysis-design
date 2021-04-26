public class ChildrenFrequentRenterPointsStrategy extends FrequentRenterPointsStrategy{
    ChildrenFrequentRenterPointsStrategy() {
        this.frequentRenterPoints = 1;
    }

    @Override
    public int computeFrequentRenterPoints(Rental rental) {
        return this.frequentRenterPoints;
    }
}

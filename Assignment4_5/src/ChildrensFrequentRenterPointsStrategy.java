public class ChildrensFrequentRenterPointsStrategy extends FrequentRenterPointsStrategy{
    ChildrensFrequentRenterPointsStrategy() {
        this.frequentRenterPoints = 1;
    }

    @Override
    public int computeFrequentRenterPoints(Rental rental) {
        return this.frequentRenterPoints;
    }
}

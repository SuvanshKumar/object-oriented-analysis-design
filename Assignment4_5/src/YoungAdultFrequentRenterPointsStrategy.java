public class YoungAdultFrequentRenterPointsStrategy extends FrequentRenterPointsStrategy {
    @Override
    public int getUpdatedFrequentRenterPoints(int frequentRenterPoints) {
        return 2 * frequentRenterPoints;
    }
}

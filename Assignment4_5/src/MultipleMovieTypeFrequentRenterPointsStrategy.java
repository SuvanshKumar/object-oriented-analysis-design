public class MultipleMovieTypeFrequentRenterPointsStrategy extends FrequentRenterPointsStrategy {
    @Override
    public int getUpdatedFrequentRenterPoints(int frequentRenterPoints) {
        return 2 * frequentRenterPoints;
    }
}

public class Rental {
    private Movie _movie;
    private int   _daysRented;
    RentalPriceStrategy rentalPriceStrategy;
    FrequentRenterPointsStrategy frequentRenterPointsStrategy;
    
    public Rental(Movie movie, int daysRented, RentalPriceStrategy rentalPriceStrategy1, FrequentRenterPointsStrategy frequentRenterPointsStrategy1) {
        _movie      = movie;
        _daysRented = daysRented;
        rentalPriceStrategy = rentalPriceStrategy1;
        frequentRenterPointsStrategy = frequentRenterPointsStrategy1;
    }

    double getRentalPrice() {
        return rentalPriceStrategy.computeRentalPrices(this);
    }

    int getFrequentRenterPoints() {
        return frequentRenterPointsStrategy.computeFrequentRenterPoints(this);
    }

    public String getSummary() {
        return "\t" + _movie.getTitle() + "\t" + String.valueOf(this.getRentalPrice()) + "\n";
    }
    
    public int getDaysRented() {
        return _daysRented;
    }
    
    public Movie getMovie() {
        return _movie;
    }
}
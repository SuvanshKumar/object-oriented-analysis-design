package src;

public class Rental {
    private Movie _movie;
    private int   _daysRented;

    private double amount;
    private int frequentPoints;
    
    public Rental(Movie movie, int daysRented) {
        _movie      = movie;
        _daysRented = daysRented;
        amount = 0;
        amount += _movie.getBaseAmount() + (_daysRented - _movie.getFreeDays()) * _movie.getDailyAmount();
        frequentPoints = 1;
        if ((_movie.getPriceCode() == Movie.NEW_RELEASE) && (_daysRented > 1)) {
            frequentPoints++;
        }
    }
    
    public int getDaysRented() {
        return _daysRented;
    }
    
    public Movie getMovie() {
        return _movie;
    }

    public double getAmount() {
        return amount;
    }

    public int getFrequentPoints() {
        return frequentPoints;
    }

    public String getSummary() {
        return "\t" + _movie.getTitle() + "\t" + String.valueOf(amount) + "\n";
    }
}
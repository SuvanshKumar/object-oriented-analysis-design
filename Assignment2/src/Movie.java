package src;

public class Movie {

    public static final int CHILDRENS   = 2;
    public static final int REGULAR     = 0;
    public static final int NEW_RELEASE = 1;
    
    private String _title;
    private int    _priceCode;

    double baseAmount;
    double dailyAmount;
    int freeDays;
    
    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }
    
    public int getPriceCode() {
        return _priceCode;
    }
    
    public void setPriceCode(int arg) {
        _priceCode = arg;
    }
    
    public String getTitle() {
        return _title;
    }

    public double getBaseAmount() {
        return baseAmount;
    }

    public double getDailyAmount() {
        return dailyAmount;
    }

    public int getFreeDays() {
        return freeDays;
    }
}
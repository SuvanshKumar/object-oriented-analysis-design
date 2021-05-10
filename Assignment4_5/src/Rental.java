public class Rental extends TransactionItem {
    private int _daysRented;
    RentalPriceStrategy rentalPriceStrategy;
    FrequentRenterPointsStrategy frequentRenterPointsStrategy;
    
    public Rental(Item item, int daysRented, RentalPriceStrategy rentalPriceStrategy1, FrequentRenterPointsStrategy frequentRenterPointsStrategy1) {
        _item = item;
        _daysRented = daysRented;
        rentalPriceStrategy = rentalPriceStrategy1;
        frequentRenterPointsStrategy = frequentRenterPointsStrategy1;
    }

    @Override
    double getTransactionItemPrice() {
        return rentalPriceStrategy.computeRentalPrices(this);
    }

    @Override
    int getFrequentRenterPoints() {
        return frequentRenterPointsStrategy.computeFrequentRenterPoints(this);
    }

    @Override
    public String getSummary() {
        return "\t(Rented)" + super.getSummary();
    }

    public int getDaysRented() {
        return _daysRented;
    }
    
    public Item getItem() {
        return _item;
    }
}
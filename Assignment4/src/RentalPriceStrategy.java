public abstract class RentalPriceStrategy {
    public double basePrice;
    public double dailyPrice;
    public int freeDays;

    public double computeRentalPrices(Rental rental){
        double price = basePrice;
        if (rental.getDaysRented() > freeDays) {
            price += (rental.getDaysRented() - freeDays) * dailyPrice;
        }
        return price;
    }
}

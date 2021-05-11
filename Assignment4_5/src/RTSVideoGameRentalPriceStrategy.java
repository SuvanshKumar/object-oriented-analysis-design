public class RTSVideoGameRentalPriceStrategy extends RentalPriceStrategy {
    RTSVideoGameRentalPriceStrategy() {
        this.basePrice = 0;
        this.freeDays = 5;
        this.dailyPrice = 1;
    }

    public double computeRentalPrices(Rental rental) {
        double price = basePrice;
        if (rental.getDaysRented() > freeDays) {
            price += (rental.getDaysRented() - freeDays) * dailyPrice;
        }
        return price;
    }
}

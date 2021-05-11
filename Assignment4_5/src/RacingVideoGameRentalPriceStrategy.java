public class RacingVideoGameRentalPriceStrategy extends RentalPriceStrategy {
    RacingVideoGameRentalPriceStrategy() {
        this.basePrice = 1;
        this.freeDays = 1;
        this.dailyPrice = 2;
    }

    public double computeRentalPrices(Rental rental){
        double price = basePrice;
        if (rental.getDaysRented() > freeDays) {
            price += (rental.getDaysRented() - freeDays) * dailyPrice;
        }
        return price;
    }
}

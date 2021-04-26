public class NewReleaseRentalPriceStrategy extends RentalPriceStrategy {

    NewReleaseRentalPriceStrategy() {
        this.basePrice = 0;
        this.freeDays = 0;
        this.dailyPrice = 3;
    }

    public double computeRentalPrices(Rental rental){
        double price = basePrice;
        if (rental.getDaysRented() > freeDays) {
            price += (rental.getDaysRented() - freeDays) * dailyPrice;
        }
        return price;
    }
}

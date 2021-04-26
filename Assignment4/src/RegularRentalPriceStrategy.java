public class RegularRentalPriceStrategy extends RentalPriceStrategy {

    RegularRentalPriceStrategy() {
        this.basePrice = 2;
        this.freeDays = 2;
        this.dailyPrice = 1.5;
    }

    public double computeRentalPrices(Rental rental){
        double price = basePrice;
        if (rental.getDaysRented() > freeDays) {
            price += (rental.getDaysRented() - freeDays) * dailyPrice;
        }
        return price;
    }
}

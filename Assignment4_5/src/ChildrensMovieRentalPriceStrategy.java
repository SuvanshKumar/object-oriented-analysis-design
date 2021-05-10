public class ChildrensMovieRentalPriceStrategy extends RentalPriceStrategy {

    ChildrensMovieRentalPriceStrategy() {
        this.basePrice = 1.5;
        this.freeDays = 3;
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

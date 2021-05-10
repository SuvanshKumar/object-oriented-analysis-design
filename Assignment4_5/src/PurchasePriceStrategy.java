public abstract class PurchasePriceStrategy {
    public double basePrice;

    public double computeRentalPrices(Purchase purchase){
        return this.basePrice;
    }
}

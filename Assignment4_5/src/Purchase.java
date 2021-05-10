public class Purchase extends TransactionItem {
    PurchasePriceStrategy purchasePriceStrategy;
    PurchaseRewardPointsStrategy purchaseRewardPointsStrategy;

    public Purchase(Item item, PurchasePriceStrategy purchasePriceStrategy1, PurchaseRewardPointsStrategy purchaseRewardPointsStrategy1) {
        _item = item;
        purchasePriceStrategy = purchasePriceStrategy1;
        purchaseRewardPointsStrategy = purchaseRewardPointsStrategy1;
    }

    @Override
    double getTransactionItemPrice() {
        return purchasePriceStrategy.computeRentalPrices(this);
    }

    @Override
    int getPurchaseRewardPoints() {
        return purchaseRewardPointsStrategy.computePurchaseRewardPoints(this);
    }

    public Item getItem() {
        return _item;
    }
}

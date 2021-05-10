public abstract class PurchaseRewardPointsStrategy {
    int purchaseRewardPoints;

    public int computePurchaseRewardPoints (Purchase purchase) {
        return purchaseRewardPoints;
    }

    public int getUpdatedPurchaseRewardPoints (int purchaseRewardPoints) {
        return this.purchaseRewardPoints;
    }
}

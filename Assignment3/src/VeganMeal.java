package src;

public class VeganMeal implements Meal {
    // Operation 1
    @Override
    public String cookMeal() {
        return "Cooking the vegan fresh food from only plant-based sources";
    }

    // Operation 2
    @Override
    public double getMealCost() {
        return 20.0;
    }

}

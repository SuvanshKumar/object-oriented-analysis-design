package src;

public class ChickenMeal extends MealDecorator {

    public ChickenMeal(Meal newMeal) {
        super(newMeal);
    }

    // Operation 1
    @Override
    public String cookMeal() {
        return super.cookMeal() + " with tasty chilly chicken and chowmein";
    }

    // Operation 2
    @Override
    public double getMealCost() {
        return super.getMealCost() + 40.0;
    }

    // Operation 3
    public String addSpices() {
        return "Adding a lot of spices";
    }

    // Operation 4
    public String addBeverage() {
        return "Adding a beverage to complement your meal";
    }
}

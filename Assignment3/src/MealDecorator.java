package src;

public abstract class MealDecorator implements Meal {
    private Meal newMeal;

    public MealDecorator(Meal newMeal) {
        this.newMeal = newMeal;
    }

    // Operation 1
    @Override
    public String cookMeal() {
        return newMeal.cookMeal();
    }

    // Operation 2
    @Override
    public double getMealCost() {
        return newMeal.getMealCost();
    }
}

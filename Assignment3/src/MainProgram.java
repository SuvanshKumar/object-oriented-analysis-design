package src;

public class MainProgram {

    public static void main(String[] args) {
        System.out.println("******************************* Introduction ******************************************");
        System.out.println("This is the main program that tests our other classes");
        System.out.println();
        System.out.println("The Meal interface defines the API of the two methods and their signatures");
        System.out.println();
        System.out.println("The VeganMeal class implements that interface, and implements two operations:");
        System.out.println("Operation 1: cookMeal() -> cooking the vegan meal");
        System.out.println("Operation 2: getMealCost() -> returns the cost of the vegan meal");
        System.out.println();
        System.out.println("The MealDecorator class is an abstract class that acts as a Decorator");
        System.out.println();
        System.out.println("The ChickenMeal is a class (concrete decorator) that extends and inherits from the " +
                "abstract MealDecorator class");
        System.out.println();
        System.out.println("It implements the original two operations with the following modifications:");
        System.out.println("Operation 1 (modified operation): cookMeal() -> cooks the chicken meal");
        System.out.println("Operation 2 (modified operation): getMealCost() -> returns the cost of the chicken meal");
        System.out.println("Operation 3 (new operation): addSpices() -> adds spices to the chicken meal");
        System.out.println("Operation 4 (new operation): addBeverage() -> adds beverage to make the meal combo");
        System.out.println();

        System.out.println("************** Here is the operation of the classes in action *************************");

        System.out.println("Vegan meal:");

        VeganMeal veganMeal = new VeganMeal();
        System.out.println(veganMeal.cookMeal());
        System.out.println(veganMeal.getMealCost());
        System.out.println();

        System.out.println("The Chicken meal:");

        ChickenMeal chickenMeal = new ChickenMeal (new VeganMeal());
        System.out.println(chickenMeal.cookMeal());
        System.out.println(chickenMeal.getMealCost());
        System.out.println(chickenMeal.addSpices());
        System.out.println(chickenMeal.addBeverage());
    }
}

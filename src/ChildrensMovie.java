package src;

public class ChildrensMovie extends Movie{

    ChildrensMovie(String name) {
        super(name, Movie.CHILDRENS);
        this.baseAmount = 1.5;
        this.freeDays = 3;
        this.dailyAmount = 1.5;
    }
}

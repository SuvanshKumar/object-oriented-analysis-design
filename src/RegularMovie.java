package src;

public class RegularMovie extends Movie {
    RegularMovie (String name) {
        super(name, Movie.REGULAR);
        this.baseAmount = 2;
        this.freeDays = 2;
        this.dailyAmount = 1.5f;
    }
}

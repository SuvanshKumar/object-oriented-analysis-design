package src;

public class NewReleaseMovie extends Movie {
    NewReleaseMovie (String name) {
        super(name, Movie.NEW_RELEASE);
        this.baseAmount = 0;
        this.freeDays = 0;
        this.dailyAmount = 3;
    }
}

package models;

public class Movie {
    protected final String title;
    protected  final String directorName;
    protected  final  double durationInMinutes;
    protected final int yearOfProduction;

    public Movie(String title, String directorName, double durationInMinutes, int yearOfProduction) {
        this.title = title;
        this.directorName = directorName;
        this.durationInMinutes = durationInMinutes;
        this.yearOfProduction = yearOfProduction;
    }
}

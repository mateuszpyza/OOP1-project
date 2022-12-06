package models;

public class Movie {
    private final String title;
    private  final String directorName;
    private  final  double durationInMinutes;
    private final int yearOfProduction;

    public Movie(String title, String directorName, double durationInMinutes, int yearOfProduction) {
        this.title = title;
        this.directorName = directorName;
        this.durationInMinutes = durationInMinutes;
        this.yearOfProduction = yearOfProduction;
    }
}

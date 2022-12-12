package models;


public class Time {
    private final static int NUMBER_OF_SECONDS_IN_MINUTE = 60;

    public static double changeMinutesToSeconds(double timeInMinutes) {
        return timeInMinutes * NUMBER_OF_SECONDS_IN_MINUTE;
    }
}

package models;

public class CinemaSeats {

    public final int seatNumber;
    public final int rowNumber;
    public boolean occupiedSeats;

    public CinemaSeats(int seatNumber, int rowNumber, boolean occupiedSeats) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        this.occupiedSeats = occupiedSeats;

    }
}

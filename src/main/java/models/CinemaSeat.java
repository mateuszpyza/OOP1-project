package models;

public class CinemaSeat {

    protected final int seatNumber;
    protected final int rowNumber;
    public boolean isOccupied;

    public CinemaSeat(int seatNumber, int rowNumber) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
    }
}

package models;

public class CinemaSeat {

    private final int seatNumber;
    private final int rowNumber;
    private boolean isOccupied;

    public CinemaSeat(int seatNumber, int rowNumber) {
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
    }
}

package apps;

import models.CinemaSeat;

public class Main {
    public static void main(String[] args) {
        CinemaSeat chair1 = new CinemaSeat(1, 1);
        System.out.println(chair1.isOccupied);
        chair1.isOccupied = true;
        System.out.println(chair1.isOccupied);

    }
}

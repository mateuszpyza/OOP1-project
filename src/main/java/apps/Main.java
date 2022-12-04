package apps;

import models.CinemaSeats;

public class Main {
    public static void main(String[]args){
         CinemaSeats chair1=new CinemaSeats(1,1,true);
        System.out.println("Numer miejsca: "+chair1.seatNumber +" rząd: "+chair1.rowNumber+" wolne: "+chair1.occupiedSeats);
        CinemaSeats chair2=new CinemaSeats(2,1,false);
        System.out.println("Numer miejsca: "+chair2.seatNumber +" rząd: "+chair2.rowNumber+" wolne: "+chair2.occupiedSeats);
        chair1.occupiedSeats=false;
        System.out.println("Numer miejsca: "+chair1.seatNumber +" rząd: "+chair1.rowNumber+" wolne: "+chair1.occupiedSeats);
    }
}

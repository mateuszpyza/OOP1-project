package apps;

import models.Manager;
import models.BaseEmployee;
import models.TicketSeller;


public class Main {

    public static void main(String[] args) {



        Manager Manager1 = new Manager("Jan", "Kowalski", 2020);
        //System.out.println("Pensja podstawowa managera wynosi: "+Manager1.getBaseSalary());
        System.out.println("Manager pracuje: " + Manager1.getYearsOfWork() + " lat.");
        System.out.println("Pensja managera wynosi: " + Manager1.calculateMonthlySalary());
        Manager1.changeBonusRate(4000);
        System.out.println("Pensja managera wynosi: " + Manager1.calculateMonthlySalary());

        TicketSeller TicketSeller1 = new TicketSeller("Sebek", "BąK", 2019);
        System.out.println("Pensja podstawowa sprzedawcy biletów wynosi : "+TicketSeller1.getBaseSalary()+'\n');
        System.out.println("Sprzedawca biletów pracuje: " + TicketSeller1.getYearsOfWork() + " lat.");
        System.out.println("Pensja sprzedawcy biletów wynosi : " + TicketSeller1.calculateMonthlySalary());

    }

}

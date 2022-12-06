package apps;

import models.Manager;
import models.BaseEmployee;
import models.TicketSeller;


public class Main {

    public static void main(String[] args) {

        BaseEmployee Employee1 = new BaseEmployee("Kamil", "Zdun", 2000);
        //System.out.println("Pensja podstawowa pracownika: "+Employee1.getBaseSalary());
        System.out.println("Pracownik pracuje: " + Employee1.getYearsOfWork() + " lat.");
        System.out.println("Pensja pracownika: " + Employee1.CalculateMonthlySalary());

        Manager Manager1 = new Manager("Jan", "Kowalski", 2020);
        //System.out.println("Pensja podstawowa managera wynosi: "+Manager1.getBaseSalary());
        System.out.println("Manager pracuje: " + Manager1.getYearsOfWork() + " lat.");
        System.out.println("Pensja managera wynosi: " + Manager1.CalculateMonthlySalary());
        Manager1.changeBonusRate(4000);
        System.out.println("Pensja managera wynosi: " + Manager1.CalculateMonthlySalary());

        TicketSeller TicketSeller1 = new TicketSeller("Sebek", "BąK", 2019);
        //System.out.println("Pensja podstawowa sprzedawcy biletów wynosi : "+TicketSeller1.getBaseSalary());
        System.out.println("Sprzedawca biletów pracuje: " + Manager1.getYearsOfWork() + " lat.");
        System.out.println("Pensja sprzedawcy biletów wynosi : " + TicketSeller1.CalculateMonthlySalary());

        Manager Manager2 = new Manager("Mateusz", "Ryś", 10000, 1939);
    }

}

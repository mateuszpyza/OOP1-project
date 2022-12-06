package models;

public class TicketSeller extends BaseEmployee {
    public TicketSeller(String firstName, String surname, int yearOfEmployment) {
        super(firstName, surname, yearOfEmployment);
        this.baseSalary = 3000;
    }

    public TicketSeller(String firstName, String surname, double baseSalary, int yearOfEmployment) {
        super(firstName, surname, baseSalary, yearOfEmployment);
    }

}

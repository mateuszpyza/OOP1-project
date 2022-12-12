package models;

public class TicketSeller extends BaseEmployee {
    private static final double BASE_SALARY = 3000;
    private double baseSalary;

    public TicketSeller(String firstName, String surname, int yearOfEmployment) {
        super(firstName, surname, yearOfEmployment);
        this.baseSalary = BASE_SALARY;
    }

    public TicketSeller(String firstName, String surname, double baseSalary, int yearOfEmployment) {
        super(firstName, surname, baseSalary, yearOfEmployment);
    }

    @Override
    public double calculateMonthlySalary() {
        return baseSalary;
    }
}

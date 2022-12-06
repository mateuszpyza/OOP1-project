package models;

public class Manager extends BaseEmployee {
    private double bonus;

    public Manager(String firstName, String surname, int yearOfEmployment) {
        super(firstName, surname, yearOfEmployment);
        this.baseSalary = 5000;
        this.bonus = 500;
    }

    public Manager(String firstName, String surname, double baseSalary, int yearOfEmployment) {
        super(firstName, surname, baseSalary, yearOfEmployment);
        this.bonus = 500;
    }

    public void changeBonusRate(double bonus) {
        this.bonus = bonus;
    }

    public double CalculateMonthlySalary() {
        return super.CalculateMonthlySalary() + bonus;
    }
}

package models;

public class Manager extends BaseEmployee {
    private static double bonus=500;
    private static double baseSalary=5000;
    public Manager(String firstName, String surname, int yearOfEmployment) {
        super(firstName, surname, yearOfEmployment);
    }

    public Manager(String firstName, String surname, double baseSalary, int yearOfEmployment) {
        super(firstName, surname, baseSalary, yearOfEmployment);
    }

    public void changeBonusRate(double bonus) {
        Manager.bonus = bonus;
    }

    @Override
    public double calculateMonthlySalary() {
        return baseSalary + bonus;
    }
}

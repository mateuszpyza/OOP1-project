package models;

public class Manager extends BaseEmployee {
    private static double BONUS = 500;
    private static double BASE_SALARY = 5000;
    private double bonus;
    private double baseSalary;

    public Manager(String firstName, String surname, int yearOfEmployment) {
        super(firstName, surname, yearOfEmployment);
        this.baseSalary = BASE_SALARY;
        this.bonus = BONUS;
    }

    public Manager(String firstName, String surname, double baseSalary, double bonus, int yearOfEmployment) {
        super(firstName, surname, baseSalary, yearOfEmployment);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public void changeBonusRate(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateMonthlySalary() {
        return baseSalary + bonus;
    }
}

package models;

public class Manager extends BaseEmployee {
    private static double BONUS = 500;
    private static double BASE_SALARY = 5000;
    private double bonus;


    public Manager(String firstName, String surname, double baseSalary, double bonus, int yearOfEmployment) {
        super(firstName, surname, baseSalary, yearOfEmployment);
        this.bonus = bonus;
    }

    public Manager(String firstName, String surname, int yearOfEmployment) {
        this(firstName, surname, BASE_SALARY, BONUS, yearOfEmployment);
    }

    public void changeBonusRate(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateMonthlySalary() {
        return getBaseSalary() + bonus;
    }
}

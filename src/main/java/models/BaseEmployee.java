package models;

public class BaseEmployee {
    protected final String firstName;
    protected final String surname;
    protected double baseSalary;
    protected final int yearOfEmployment;

    public BaseEmployee(String firstName, String surname, int yearOfEmployment) {
        this.firstName = firstName;
        this.surname = surname;
        this.baseSalary = 3000;
        this.yearOfEmployment = yearOfEmployment;
    }

    public BaseEmployee(String firstName, String surname, double baseSalary, int yearOfEmployment) {
        this.firstName = firstName;
        this.surname = surname;
        this.baseSalary = baseSalary;
        this.yearOfEmployment = yearOfEmployment;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public int getYearsOfWork() {
        int currentYear = 2022;
        return currentYear - yearOfEmployment;
    }

    public double CalculateMonthlySalary() {
        return baseSalary;
    }

}


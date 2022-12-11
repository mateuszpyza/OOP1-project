package models;

public abstract class BaseEmployee {
    private final String firstName;
    private final String surname;
    protected static double baseSalary=3000;
    private final int yearOfEmployment;

    public BaseEmployee(String firstName, String surname, int yearOfEmployment) {
        this.firstName = firstName;
        this.surname = surname;
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

    public abstract double calculateMonthlySalary();




}


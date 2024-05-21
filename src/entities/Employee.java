package entities;

public class Employee {
    public String Name;
    public double GrossSalary;
    public double Tax;
    public double percentage;

    public double NetSalary() { return GrossSalary - Tax; }
    public double IncreaseSalary() { return (GrossSalary - Tax) + (GrossSalary * (percentage / 100)); }
}

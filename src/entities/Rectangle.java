package entities;

public class Rectangle {
    public double a;
    public double b;

    public double area() { return a * b; }
    public double perimeter() { return a * 2 + b * 2; }
    public double diagonal() { return Math.sqrt(Math.pow(a,2) + Math.pow(b,2)); }

}

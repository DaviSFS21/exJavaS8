package application;

import entities.Employee;
import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione um exercício para ver a solução: ");
        System.out.println("1 - Rectangle properties");
        System.out.println("2 - Salary details and increase");
        System.out.println("3 - Student grades");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                Rectangle x;
                x = new Rectangle();

                System.out.println("Enter the height and weight of the rectangle:");
                x.a = sc.nextDouble();
                x.b = sc.nextDouble();

                double area = x.area();
                double perimeter = x.perimeter();
                double diagonal = x.diagonal();

                System.out.printf("Area: %.2f%nPerimeter: %.2f%nDiagonal: %.2f", area, perimeter, diagonal);
                break;
            case 2:
                Employee y;

                y = new Employee();

                System.out.println("Enter the name, the gross salary and tax of the employee: ");
                y.Name = sc.next();
                y.GrossSalary = sc.nextDouble();
                y.Tax = sc.nextDouble();

                System.out.printf("Employee: %s, $ %.2f%n", y.Name, y.NetSalary());

                System.out.println("Enter the salary increase percentage: ");
                y.percentage = sc.nextDouble();

                System.out.printf("Updated data: %s, $ %.2f%n", y.Name, y.IncreaseSalary());
            case 3:

        }
    }
}

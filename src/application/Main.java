package application;

import entities.Employee;
import entities.Rectangle;
import entities.Student;

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
                y.name = sc.next();
                y.grossSalary = sc.nextDouble();
                y.tax = sc.nextDouble();

                System.out.printf("Employee: %s, $ %.2f%n", y.name, y.NetSalary());

                System.out.println("Enter the salary increase percentage: ");
                y.percentage = sc.nextDouble();

                System.out.printf("Updated data: %s, $ %.2f%n", y.name, y.IncreaseSalary());
                break;
            case 3:
                Student z;
                z = new Student();

                System.out.println("Enter the name of the student: ");
                z.name = sc.next();
                System.out.println("Enter the first grade of the student: ");
                double grade1 = sc.nextDouble();
                System.out.println("Enter the second grade of the student: ");
                double grade2 = sc.nextDouble();
                System.out.println("Enter the third grade of the student: ");
                double grade3 = sc.nextDouble();

                System.out.printf("Final grade = %.2f", z.finalGrade());

                if (z.finalGrade() >= 6) {
                    System.out.println("Pass");
                } else {
                    System.out.println("Failed");
                    System.out.printf("Missing = %.2f", 6 - z.finalGrade());
                }
                break;
        }
    }
}

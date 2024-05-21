package application;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle x;
        x = new Rectangle();

        System.out.println("Enter the height and weight of the rectangle:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();

        double area = x.area();
        double perimeter = x.perimeter();
        double diagonal = x.diagonal();

        System.out.printf("Area: %.2f%nPerimeter: %.2f%nDiagonal: %.2f",area,perimeter,diagonal);
    }
}

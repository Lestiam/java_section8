package section69.application.ex1;

import section69.application.ex1.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();


        System.out.println(rectangle.area());// traz a area do retangulo
        System.out.println(rectangle.perimeter()); // traz o perímetro do retangulo
        System.out.println(rectangle.diagonal()); //// traz a diagonal do retangulo

        System.out.println(rectangle);

        sc.close();
    }
}

package section69.application.ex3;

import section69.application.ex3.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Name and grades: ");
        student.name = sc.nextLine();
        student.tri1 = sc.nextDouble();
        student.tri2 = sc. nextDouble();
        student.tri3 = sc.nextDouble();

        System.out.println("\n"+ student);
    }
}

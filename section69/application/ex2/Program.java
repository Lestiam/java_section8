package section69.application.ex2;

import section69.application.ex2.entities.Salary;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Salary salary = new Salary();

        System.out.print("Name: ");
        salary.name = sc.nextLine();
        System.out.print("Gross salary: ");
        salary.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        salary.tax = sc.nextDouble();


        System.out.println("\nEmployee: " +salary.name + ", $ " + salary.netSalary());

        System.out.println("\nWhich percentage to increase salary? ");
        double percent = sc.nextDouble();
        salary.increaseSalary(percent);

        System.out.println("\n"+salary);

        sc.close();
    }
}

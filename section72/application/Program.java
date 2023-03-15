package section72.application;

import section72.application.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Whats is the dollar price? ");
        double value = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        double howMuch = sc.nextDouble();
        double convert = CurrencyConverter.convert(value,howMuch);

//        System.out.println("How many dollars will be bought? ");
//        double d = CurrencyConverter.howManyDolars();

        System.out.printf("Amount to be paid in reais = %.2f%n", convert);

        sc.close();
    }
}

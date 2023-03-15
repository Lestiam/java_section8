package section70.application.version2;

import section70.application.version2.util.Calculator;

//versão 2: instanciando objetos
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();//Como os membros da classe não são estáticos, eu sou OBRIGADO a instanciar um objeto

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius);

        double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f%n",c);
        System.out.printf("Colume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);

        sc.close();
    }
}


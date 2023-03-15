package section70.application.version3;

//versão 3: como agora os métodos do Calculator são estáticos,
// eu não preciso instanciar um objeto, eu posso chamar a própria Classe (Calculator)
import section70.application.version3.util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circumference(radius);//chamando diretamente pela classe e não pelo objeto como no version 2

        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n",c);
        System.out.printf("Colume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        sc.close();
    }
}


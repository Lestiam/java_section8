//versão 1: métodos na própria classe do programa
//Nota: dentro de um método estático, você não pode chamar membros de instância da mesma classe.
package section70.application.version1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    //o padrão de nome para constantes saõ letras maiúsculas
    public static final double PI = 3.14159; //a palavra final serve para mostrar que o PI é uma constante, não vai mudar mais
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);

        double v = volume(radius);

        System.out.printf("Circumference: %.2f%n",c);
        System.out.printf("Colume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", PI);

        sc.close();
    }

    public static  double circumference(double radius){//voce não pode chamar um método que não é static dentro de uma classe static!!!
        return 2.0 * PI * radius;
    }
    public static  double volume(double radius){
        return 4.0 * PI * Math.pow(radius,3) / 3.0;
    }

}

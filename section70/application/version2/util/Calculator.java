package section70.application.version2.util;

public class Calculator {
    //o padrão de nome para constantes saõ letras maiúsculas
    public final double PI = 3.14159; //a palavra final serve para mostrar que o PI é uma constante, não vai mudar mais

    public double circumference(double radius){//como vem de outra classe, não precisam ser estáticos
        return 2.0 * PI * radius;
    }
    public double volume(double radius){
        return 4.0 * PI * Math.pow(radius,3) / 3.0;
    }
}

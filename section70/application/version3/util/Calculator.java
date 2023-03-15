package section70.application.version3.util;
//como a calculadora é apenas uma calsse utilitária, com operações e constantes estáticas
//eu pude declarar todo mundo como Static para chama-los no Program através do nome da Classe
public class Calculator {
    //o padrão de nome para constantes saõ letras maiúsculas
    public static final double PI = 3.14159; //a palavra final serve para mostrar que o PI é uma constante, não vai mudar mais

    public static double circumference(double radius){
        return 2.0 * PI * radius;
    }
    public static double volume(double radius){
        return 4.0 * PI * Math.pow(radius,3) / 3.0;
    }
}

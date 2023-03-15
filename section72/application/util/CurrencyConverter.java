package section72.application.util;

public class CurrencyConverter {
    public static final double TAX =  1.06;
    

    public static double convert(double dolarValue, double dolarsBought){
        return dolarValue * dolarsBought * TAX;
    }

}
